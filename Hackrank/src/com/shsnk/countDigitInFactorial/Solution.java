package com.shsnk.countDigitInFactorial;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=factDigit(n);
        System.out.println(count);
    }
   public static int factDigit(int n)
    {
        int f=1;
        while(n>0)
        {
            f=f*n--;
        }
        String s=Integer.toString(f);
        return s.length();
    }
}
