package com.shshnk.JavaStringReverseConcatinate;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.next(),s=sc.next();
        String str=s+st;
        for(int i=str.length()-1;i>=0;i--)
        {
            System.out.print(str.charAt(i));
        }
    }
}
