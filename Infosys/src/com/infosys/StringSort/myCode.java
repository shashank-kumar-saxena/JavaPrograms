package com.infosys.StringSort;

import java.lang.reflect.Array;
import java.util.Scanner;

public class myCode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.next();
        if(st.length()>=2)
        {
            int frenum=0,freaplha=0,term=0;
            String num="",alpha="";
            for(int i=0;i< st.length();i++)
            {
                char c=st.charAt(i);
                if(Character.isDigit(c))
                {
                    num=num+c;
                    frenum++;
                }
                else if(Character.isAlphabetic(c))
                {
                    alpha=alpha+c;
                    freaplha++;
                }
                else
                {
                    System.out.println("-1");
                    term=1;
                    break;
                }
            }
            if(freaplha>0&&frenum>0)
            {
                alpha=sort(alpha);
                num=sort(num);
                int smallDigit=Integer.parseInt(String.valueOf(num.charAt(0)));
                int largDigit=Integer.parseInt(String.valueOf(num.charAt(num.length()-1)));
                int diff=st.indexOf(alpha.charAt(0))-st.indexOf(alpha.charAt(alpha.length()-1));
                System.out.print(alpha);
                System.out.print(Integer.toString(diff)+":");
                int diff2=st.indexOf(Integer.toString(largDigit))-st.indexOf(Integer.toString(smallDigit));
                int sum=0;
                for(int i=0;i<num.length();i++)
                {
                    sum=sum+Integer.parseInt(String.valueOf(num.charAt(i)));
                }
                System.out.println(sum+""+diff2);
            }
            else
            {
                System.out.println(-1);
            }
        }
        else
        {
            System.out.println("-1");
        }
    }
    static String sort(String a)
    {
        char cc[]=new char [a.length()];
        for(int i=0;i<a.length();i++)
        {
            cc[i]=a.charAt(i);
        }
        for(int i=0;i<cc.length;i++)
        {
            for(int j=1;j<cc.length;j++)
            {
                if(cc[j-1]>cc[j])
                {
                    char t=cc[j];
                    cc[j]=cc[j-1];
                    cc[j-1]=t;
                }
            }
        }
        a="";
        for(int i=0;i<cc.length;i++)
        {
            a=a+cc[i];
        }
        return a;
    }

}
