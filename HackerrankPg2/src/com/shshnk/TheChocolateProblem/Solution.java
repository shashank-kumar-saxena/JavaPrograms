package com.shshnk.TheChocolateProblem;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(sc.next());
        }
        int i=0,l=a.length-1;
        while (i<l)
        {
            if(a[i]>a[l])
            {
                i++;
            }
            else
            {
                l--;
            }
        }
        System.out.println(a[i]);
    }
}
