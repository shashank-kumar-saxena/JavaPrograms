package com.shsnk.countOfCamelCaseCharacter;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(Character.isUpperCase(c))
                count++;
        }
        System.out.println(count);
    }
}
