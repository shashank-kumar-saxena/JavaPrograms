package com.CodeChief.PairOfPrime;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            if (n > 0) {
                int a[] = new int[n];
                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }
                for (int i = 0; i < a.length; i++) {
                    int num = a[i];
                    if (num <= 3) {
                        System.out.println(-1 + " " + -1);
                    } else {
                        int count = 0;
                        for (int j = 2; j <= num; j++) {
                            for (int k = 2; k <= num; k++) {
                                if (isPrime(j) && isPrime(k)) {
                                    if (num == j + k) {
                                        System.out.println(j + " " + k);
                                        count++;
                                        break;
                                    }
                                }
                            }
                            if (count > 0) {
                                break;
                            }
                        }
                    }
                }
            } else {
                System.out.println(-1);
            }
        } catch (Exception e) {
            System.out.println(-1);
        }

    }

    static boolean isPrime(int n) {
        int cpy = n;
        n--;
        while (n > 1) {

            if (cpy % n == 0) {
                return false;
            }
            n--;
        }
        return true;
    }
}
