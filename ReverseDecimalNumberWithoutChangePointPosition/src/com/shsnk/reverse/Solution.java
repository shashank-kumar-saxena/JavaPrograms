package com.shsnk.reverse;

import java.util.Scanner;

public class Solution {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        Double d=sc.nextDouble();
        int index=0;
        String s=Double.toString(d);
        String st="";
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c!='.')
            {
                st=c+st;
            }
            else
            {
                index=s.indexOf('.');
            }
        }
        String str=st.substring(0,index)+'.'+st.substring(index);
        d=Double.parseDouble(str);
        System.out.println(d);
    }
}
