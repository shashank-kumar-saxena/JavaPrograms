package com.shsnk.powerOfFour;

import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        if(n%4==0)
        {
            while(true)
            {
                int s=(int)Math.pow(4,i);
                if(n==s) {
                    System.out.println("YES");
                    break;
                }
                else if(s>n) {
                    System.out.println("NO");
                    break;
                }
                i++;
            }
        }
        else
            System.out.println("No");
    }
}
