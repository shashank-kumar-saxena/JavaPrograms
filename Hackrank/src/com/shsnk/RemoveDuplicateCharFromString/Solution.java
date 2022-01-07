package com.shsnk.RemoveDuplicateCharFromString;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int count=0;
        char c[]=s.toCharArray();
        String st="";
        for(int i=0;i<c.length;i++)
        {
            if(i!=0)
            {
                for(int j=0;j<=st.length()-1;j++)
                {
                    if(c[i]==st.charAt(j)) {
                        count = 1;
                        break;
                    }
                }
                if(count!=1)
                    st=st+c[i];
                count=0;
            }
            else
                st=st+c[i];
        }
        System.out.println(st);
    }
}
