package com.shsnk.eg;

import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter the number");
        num=sc.nextInt();
        palindrom pb =new palindrom();
        pb.fun(num);
    }
    public void fun(int i)
    {
     if(i==0)
     {
         System.out.println();
     }
     else {
         System.out.println(i--);
         fun(i);
     }
    }
}
