package com.shsnk.minimalMoveToFormString;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.next();
        int count=0,l=st.length();
        String str="";
        while (l>=1)
        {
            if(l%2==0)
            {
                l=l/2;
            }
            else
            {
                l--;
            }
            count++;
        }
        System.out.println(count);
    }
}
