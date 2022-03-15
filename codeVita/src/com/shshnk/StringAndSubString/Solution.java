package com.shshnk.StringAndSubString;
// A Java program to print all subsets of a set

import java.util.ArrayList;
import java.util.Scanner;

class Solution {

    static void printSubsets(String set[]) {
        try {
            int n = set.length;
            String s = "";
            ArrayList<String> list = new ArrayList<>();
            for (int i = 0; i < (1 << n); i++) {

                for (int j = 0; j < n; j++)
                    if ((i & (1 << j)) > 0)
                        s = s + set[j] + " ";
                list.add(s);
                s = "";
            }

            for (int i = 0; i < list.size(); i++) {
                for (int j = i + 1; j < list.size(); j++) {
                    int one = list.get(i).length();
                    int two = list.get(j).length();
                    if (one == two) {
                        if (list.get(i).compareTo(list.get(j)) > 0) {
                            String temp = list.get(i);
                            list.set(i, list.get(j));
                            list.set(j, temp);
                        }
                    } else {
                        if (one > two) {
                            String temp = list.get(i);
                            list.set(i, list.get(j));
                            list.set(j, temp);
                        }
                    }
                }
            }
            for (int j = 0; j < list.size(); j++) {
                if (j == 0) {
                    System.out.print("{}");
                } else {
                    String str = list.get(j);
                    System.out.print('{');
                    for (int i = 0; i < str.length(); i++) {
                        if (i == str.length() - 1)
                            System.out.print('}');
                        else {
                            if (str.charAt(i) != ' ')
                                System.out.print(str.charAt(i));
                            else
                                System.out.print(",");
                        }
                    }
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.length() > 0) {
            String a[] = s.split(",");
            printSubsets(a);
        }
    }
}