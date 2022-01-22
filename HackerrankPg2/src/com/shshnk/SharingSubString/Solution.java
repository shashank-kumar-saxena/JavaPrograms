package com.shshnk.SharingSubString;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next(),st=sc.next();
        int index1=0,count=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            for(int j=0;j<st.length();j++)
            {
                char ch=st.charAt(j);
                if(c==ch)
                {
                    if(index1<j||index1==0) {
                        {
                            index1 = j;
                            count++;
                        }

                    }
                }
            }
        }
        if(count>1)
        System.out.println(1);
        else
            System.out.println(0);
    }
}
