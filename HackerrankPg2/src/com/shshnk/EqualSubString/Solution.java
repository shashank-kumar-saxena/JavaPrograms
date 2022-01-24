package com.shshnk.EqualSubString;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.next();
        int count=0;
        if(st.length()<3)
        {
            System.out.println(0);
        }
        else
        {
            for(int i=2;i<st.length();i++)
            {

                char c=st.charAt(i-2);
                char ch=st.charAt(i-1);
                char chr=st.charAt(i);
                        if((c=='0'&&ch=='1'&&chr=='2')||(c=='0'&&ch=='2'&&chr=='1')||(c=='1'&&ch=='0'&&chr=='2')||(c=='1'&&ch=='2'&&chr=='0')||(c=='2'&&ch=='0'&&chr=='1')||(c=='2'&&ch=='1'&&chr=='0'))
                        {
                            count++;
                        }
            }
        }
        System.out.println(count);
    }
}
