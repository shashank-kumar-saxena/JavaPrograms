package com.shsnk.winnerOfAnElection;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s="";
        String []a=new String[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.next();
        }
        int max=0,count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i].equals(a[j]))
                {
                    count++;
                }
            }
            if(max<count)
            {
                s=a[i];
                max=count;
            }
            count=0;
        }
        System.out.println(s+" "+max);
    }
}
