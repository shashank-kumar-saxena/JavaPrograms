package com.shsnk.Candle;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,count=1;
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
