import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        ArrayList<String> list=new ArrayList<String>();
        ArrayList<Integer> ans=new ArrayList<Integer>();
        for(int j=0;j<p;j++)
        {
            String s=sc.next();
            String st=sc.nextLine();
            if(s.equals("add"))
            {
                list.add(st);
            }
            else
            {
                int count=0;
                for(String i:list)
                {
                    if(i.indexOf(st)==0)
                    {
                        count++;
                    }
                }
                ans.add(count);
            }
        }
        for(int i: ans)
        {
            System.out.println(i);
        }
    }
}
