package com.shsnk.addTwoFraction;

public class Solution {
    public static void main(String[] args) {
        int n1=3,d1=500,n2=1,d2=500;
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
