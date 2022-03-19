package level2.String;

import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for(int l=1;l<=t;l++)
        {
            int n=sc.nextInt();
            String s=sc.next();
            String st="",str="";
            for(int i=0;i<n;i++)
            {
                char c=s.charAt(i);
                if(c=='?')
                {
                    st=st+"?";
                }
                else {
                    str=str+c;
                }
            }
            if(str.length()==0)
            {
                if(st.length()%2==0)
                {
                    System.out.println(st.length());
                }
                else
                {
                    System.out.println(st.length()-1);
                }
            }
            else
            {
                int i,count=0;
                int len=st.length()<str.length()?st.length():str.length();
                for(i=0;i<len;i++)
                {
                        count+=2;
                }
                if(st.length()>str.length())
                {
                    int fcount=st.length()-i;
                    if(fcount%2==0)
                    {
                        count=count+fcount;
                    }
                    else
                    {
                        count=count+fcount-1;
                    }
                }
                System.out.println(count);
            }
        }
    }
}
