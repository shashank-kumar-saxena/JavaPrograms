package com.shsnk.iceCream;

import java.util.Scanner;

public class Soluion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=690)
            System.out.println("1 "+(n-690));
        else
            System.out.println("0");
    }
}
