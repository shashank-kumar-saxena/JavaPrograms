package com.shsnk.GreatestNumber;

public class GreatestNumber {
    public static void funCalGreatest(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println(a + " is the greatest number");
        } else {
            int d = b > c ? b : c;
            System.out.println(d + " is the grestest number");
        }
    }
}
