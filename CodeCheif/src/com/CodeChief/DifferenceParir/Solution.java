package com.CodeChief.DifferenceParir;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int l = 1; l <= t; l++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int a[][] = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            int diff = 0, max = 0;
            for (int i = 0; i < n; i++) {
                int min = a[i][0];
                for (int j = 0; j < m; j++) {
                    if (min > a[i][j]) {
                        min = a[i][j];
                    }
                    if (max < a[i][j]) {
                        max = a[i][j];
                    }
                }
                if (max - min > diff) {
                    diff = max - min;
                }
                max = 0;
                min = 0;
            }
            System.out.println(diff);
        }
    }
}
