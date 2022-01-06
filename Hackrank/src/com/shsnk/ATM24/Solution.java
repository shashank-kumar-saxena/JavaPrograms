package com.shsnk.ATM24;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double w=sc.nextDouble();
        double n=sc.nextDouble();
        double res=0;
        if(n>w && w%5==0)
        {
            res=n-((double)w)-(0.5);

        }
        else
            res=n;
        System.out.println(res);
    }
}