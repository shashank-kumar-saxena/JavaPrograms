package LexiString;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> list=new ArrayList<>();
        int t=sc.nextInt();
        if(t>=1&&t<=5)
        {
            int i=0;
            do{
                int n=sc.nextInt();
                int upp=0,index=0;
                String s=sc.next();
                if(n==s.length())
                for(i=0;i<n;i++)
                {
                    char c=s.charAt(i);
                       if(upp<=(int)c)
                       {
                           upp=(int)c;
                           index=i;
                       }

                }
                String str=s.substring(index+1,s.length());
                StringBuilder stri=new StringBuilder(s.substring(0,index+1));
                stri.reverse();
                list.add(stri.toString()+str);
                t--;
            }while (t>0);
            for(i=0;i<list.size();i++)
            {
                System.out.println(list.get(i));
            }
        }
    }
}
