package com.shsnk.stringIsRotatedByTwoPlace;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next(),st=sc.next();
        String str=s.substring(2)+s.substring(0,2);
        String str2=s.substring(s.length()-2)+s.substring(0,s.length()-2);
        if(str.equals(st)||str.equals(str2))
        {
            System.out.println("1");
        }
        else
        {
            System.out.println("0");
        }
    }
}
