package com.shsnk.zeroToOne;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int s=0;
        while (n>0)
        {
            int temp=n%10;
            if(temp==0)
                s=s*10+5;
            else
                s=s*10+temp;
            n=n/10;
        }
        while(s>0)
        {
            System.out.print(s%10);
            s/=10;
        }
    }
}
