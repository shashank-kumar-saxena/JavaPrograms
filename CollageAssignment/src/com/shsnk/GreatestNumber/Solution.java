package com.shsnk.GreatestNumber;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the three number");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        GreatestNumber.funCalGreatest(a,b,c);
    }
}
