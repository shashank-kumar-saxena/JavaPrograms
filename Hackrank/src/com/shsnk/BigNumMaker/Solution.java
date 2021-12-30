package com.shsnk.BigNumMaker;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=Integer.toString(n);
        int [] ar=new int[s.length()];
        for(int i=0;i<s.length();i++)
        {
            ar[i]=n%10;
            n/=10;
        }
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<s.length();j++)
            {
                if(ar[i]>ar[j])
                {
                    int temp=ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                }
            }
        }
        for(int i=0;i<s.length();i++)
        {
            System.out.print(ar[i]);
        }
    }
}
