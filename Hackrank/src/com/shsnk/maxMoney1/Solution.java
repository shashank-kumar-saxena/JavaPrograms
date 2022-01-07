package com.shsnk.maxMoney1;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();
        if(n>2)
            n=(n/2)+1;
        else if(n==2)
            n--;

        System.out.println(n*k);
    }
}
