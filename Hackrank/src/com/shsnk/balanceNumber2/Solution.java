package com.shsnk.balanceNumber2;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=1234006;
        String s=Integer.toString(n);
        int len=s.length(),lms=0,rhs=0;
        int []a=new int[s.length()];
        for(int i=0;i<a.length;i++)
        {
            a[i]=n%10;
            n/=10;
        }
        for(int i=0;i<a.length;i++)
        {
            if(i+1<=(len/2))
            {
                lms+=a[i];
            }
            else if(i!=(len/2))
            {
                rhs+=a[i];
            }
        }
        if(lms==rhs)
        {
            System.out.println('1');
        }
        else
            System.out.println('0');
    }
}
