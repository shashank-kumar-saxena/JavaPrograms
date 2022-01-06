package com.shsnk.ATM24;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt();
        int n=sc.nextInt();
        if(n>w)
        {
            float res=(float)(n-w-(0.5));
            System.out.println(res);
        }
        else
            System.out.println(w);
    }
}
