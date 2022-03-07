package com.shsnk.fact;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Soution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0)
        {
            System.out.println(factorial(n));
        }
        else
        {
            System.out.println(-1);
        }
    }
    static ArrayList<Integer> factorial(int N){
        int fact=1;
        java.math.BigInteger A=java.math.BigInteger.valueOf(1);
        while (N>0) {
            A = A.multiply(java.math.BigInteger.valueOf(N));
            N--;
        }
        ArrayList<Integer> list=new ArrayList<>();
        char []s = A.toString().toCharArray();
        for(int j=0;j<s.length;j++)
        {
            list.add(Integer.parseInt(String.valueOf(s[j])));
        }
        return list;
    }
}
