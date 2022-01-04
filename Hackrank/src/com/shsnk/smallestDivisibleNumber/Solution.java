package com.shsnk.smallestDivisibleNumber;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;

        }
        int s = n, c = 1;
        while (true) {
            for (int j = 0; j < a.length; j++) {
                if (s % a[j] != 0) {
                    c = 0;
                    break;
                }
            }
            if (c == 1) {
                System.out.println(s);
                break;
            }
            c = 1;
            s++;
        }

    }
}
