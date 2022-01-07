package com.shsnk.buggerGame;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt(),count=1;
        while(true)
        {
            int res=bugger(n);
            if(res<=9)
            {
                System.out.println(count);
                break;
            }
            n=res;
            count++;
        }
    }
    public static int bugger(int n)
    {
        int s=1;
        while(n>0)
        {
            s=s*(n%10);
            n/=10;
        }
        return (s);
    }
}
