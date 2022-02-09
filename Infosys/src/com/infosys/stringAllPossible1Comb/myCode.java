package com.infosys.stringAllPossible1Comb;
//shashank
import java.util.Scanner;

public class myCode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        myCode sol=new myCode();
        String s=sc.next();
        int num=sc.nextInt();
        int fre=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c!='1'&&c!='0')
            {
                fre++;
                break;
            }
        }
        if(fre==0)
        {
            int len=s.length()-1,p=0;
            String st="",str="";
            for(int i=0;i<=s.length()-1;i++)
            {
                for(int j=0;j<len+1;j++)
                {
                    for(int k=i;k<=j;k++)
                    {
                        if(p==0)
                            p=1;
                            st=st+s.charAt(k);
                    }
                    if(p==1&&sol.cont(st,str))
                    {
                        str=str+st+" ";
                    }
                    p=0;
                    st="";
                }
            }
            int count=0,freCount=0;
            String []a=str.split(" ");
            for(int i=0;i<a.length;i++)
            {
                for(int j=0;j<a[i].length();j++)
                {
                    char c=s.charAt(j);
                    if(c=='1')
                        count++;
                }
                if(num==count&&count>0)
                    freCount++;
                count=0;
            }
            if(freCount>0)
            {
                System.out.println(freCount);
            }
            else
            {
                System.out.println(-1);
            }
        }
        else
        {
            System.out.println(-1);
        }
    }
    public boolean cont(String s,String str)
    {
        str=str+" ";
        String st="";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch!=' ')
            {
                st=st+ch;
            }
            else
            {
                if(st.equals(s))
                    return true;
                st="";
            }
        }
        return true;
    }
}
