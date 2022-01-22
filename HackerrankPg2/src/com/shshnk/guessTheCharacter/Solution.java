package com.shshnk.guessTheCharacter;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Solution sol=new Solution();
        String st=sc.next();
        int n=sc.nextInt();
        String s="",str="";
        int len=st.length()-1,p=0;
        for(int i=0;i<=st.length()-1;i++)
        {
            for(int j=0;j<len+1;j++)
            {
                for(int k=i;k<=j;k++)
                {

                    if(p==0)
                    p=1;
                    s=s+st.charAt(k);
                }
                if(p==1&&sol.cont(s,str)) {
                    str = str + s + " ";

                }
                p=0;
                s="";
            }
        }
        String[] a =str.split(" ");
        Arrays.sort(a);
        str="";
        for(int i=0;i<a.length;i++)
        {
            str=str+a[i];
        }
        System.out.println(str.charAt(n-1));
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
                    return false;
                st="";
            }
        }

        return true;
    }

}
