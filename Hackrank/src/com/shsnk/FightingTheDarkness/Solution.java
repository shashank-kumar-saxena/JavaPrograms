package com.shsnk.FightingTheDarkness;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int max=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(max<a[i])
                max=a[i];
        }
        System.out.println(max);
    }
}
