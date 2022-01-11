package com.shsnk.SuffleString3;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int element;
        int []a=new int[s.length()];
        char []b=new char[s.length()];
        for(int i=0;i<s.length();i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            element=a[i];
            b[element]=s.charAt(i);
        }
        for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i]);
        }
    }
}
