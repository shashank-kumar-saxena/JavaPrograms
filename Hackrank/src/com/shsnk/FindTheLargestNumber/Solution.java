package com.shsnk.FindTheLargestNumber;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(find(n));
    }
   public static int find(int N){
        while (N > 0) {
            int ld = -1;

            int num = N;
            boolean da = true;//check for ascending
            while (num > 0 && da) {
                int digit = num % 10;
                num = num / 10;

                if (ld != -1 && ld < digit) {
                    da = false;
                    break;
                }
                ld = digit;
            }

            if (da) {
                break;
            } else {
                --N;
            }

        }

        return N;
    }
}
