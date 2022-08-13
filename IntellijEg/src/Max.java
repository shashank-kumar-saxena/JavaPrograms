import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
        String s="1234";
        System.out.println(maximiser(s,2));
    }
    static int maximiser(String input1,int input2)
    {
        int res=Integer.parseInt(input1);
        String s="";
        int len=input2;
        int copy=input2;
        for(int l=input1.length()-1;l>input2;l--) {
            input2=copy;
            int a=l;
            char c[]=input1.toCharArray();
            while (input2 > 0) {
                int i=a--;
                int j=a;
                try{
                    char t = c[i];
                    c[i] = c[j];
                    c[j] = t;
                }catch (Exception e)
                {}
                for (char ch : c) {
                    if (ch != '[' && ch != ']' && ch != ',')
                        s = s + ch;
                }
                int num1 = Integer.parseInt(s);
                res = Math.max(res, num1);
                s = "";
                input2--;
            }
        }
        return res;
    }
}
