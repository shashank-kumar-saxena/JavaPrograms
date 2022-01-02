package com.shsnk.DaysOfOurLive;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();
        int d=n/7;
        int []a= {n/7,n/7,n/7,n/7,n/7,n/7,n/7};
         d=n%7;
        while(d>0)
        {
            a[k-1]+=1;
            if(k==7)
            {
                k=1;
            }
            k++;
            d--;
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
