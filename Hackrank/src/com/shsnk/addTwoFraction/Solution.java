package com.shsnk.addTwoFraction;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt(),d1=sc.nextInt(),n2=sc.nextInt(),d2=sc.nextInt();
        if(d1==d2)
        {
            System.out.println((n1+n2)+"/"+(d1));
        }
        else
        {
            int res=((n1*d2)+(n2*d1))/(d1+d2);
            System.out.println(res);
        }
    }
}
