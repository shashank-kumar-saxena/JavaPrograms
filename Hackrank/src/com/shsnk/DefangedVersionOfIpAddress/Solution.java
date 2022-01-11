package com.shsnk.DefangedVersionOfIpAddress;

import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next(),st="";
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='.')
            {
                st=st+"[.]";
            }
            else
                st=st+c;
        }
        System.out.println(st);
    }
}
