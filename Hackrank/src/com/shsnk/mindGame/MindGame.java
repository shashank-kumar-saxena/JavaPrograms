package com.shsnk.mindGame;

import java.util.Scanner;

public class MindGame {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int cpy=n;
        n=n+n;
        n=n+10;
        n/=2;
        n=n-cpy;
        System.out.println(n);
    }
}
