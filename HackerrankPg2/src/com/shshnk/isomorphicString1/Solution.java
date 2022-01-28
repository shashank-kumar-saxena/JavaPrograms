package com.shshnk.isomorphicString1;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner((System.in));
        String s=sc.next(),st=sc.next();
        int f=0;
        int diff=(int)(s.charAt(0))-(int)(st.charAt(0));
        if(s.length()==st.length()) {
            for (int i = 0; i < s.length(); i++)
            {
                int mDiff=(int)s.charAt(i)-(int)st.charAt(i);
                if(mDiff!=diff)
                {
                    f=1;
                    break;
                }
            }
            if(f==0)
            {
                System.out.println(1);
            }
            else
            {
                System.out.println(0);
            }
        }
        else
        {
            System.out.println(1);
        }
    }
}
