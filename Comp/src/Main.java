import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        String a[]=whoIsTheWinner("HELLI25O 6"," ","1","BEST1","1 AR 25 TWO");
        System.out.println(test(a));
    }
    static String test(String str[]) {

        char []arr = str[str.length-1].toCharArray();
        String s="",st="";
        for(int i=0;i<arr.length;i++){
            if(Character.isDigit(arr[i]))
            {
                st=st+arr[i];
            }else if(i!=0&&Character.isDigit(arr[i-1]))
            {
                System.out.println(11);
                s=s+" "+st;
                st="";
            }
        }
        if(st.length()>0)
            s=s+" "+st;
        String []a=s.split(" ");
        Arrays.sort(a);
        int size = a.length;
        for(int i = 0; i<size-1; i++)
        {
            for (int j = i+1; j<a.length; j++)
            {
                if(a[i].compareTo(a[j])<0)
                {
                    String temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
        Arrays.sort(arr);
        String str2="";
        for(char c:arr)
        {
            if(Character.isAlphabetic(c))
                str2=str2+c;
        }
        for(String ss:a)
        {
            str2=str2+" "+ss;
        }
        return str2;
    }
    private static String[] whoIsTheWinner(String s, String s1, String s2, String s3, String s4) {
        ArrayList<String> list =new ArrayList<>();
        list.add(s);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        Collections.sort(list);
        String str[]=new String[5];
        for(int i=0;i<list.size();i++)
        {
            str[i]=list.get(i);
        }
        return str;
    }

}
