package com.shsnk.FizzBuzz12;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String []st=new String[n];
        for(int i=1;i<=n;i++)
        {
            if((i%3==0)&&(i%5==0))
            {
                st[i-1]="\'BuzzFizz\'";
            }
            else
            {
                if(i%3==0)
                {
                    st[i-1]="\'Fizz\'";
                }
                else if(i%5==0)
                {
                    st[i-1]="\'Buzz\'";
                }
                else
                {
                    st[i-1]="\'"+Integer.toString(i)+"\'";
                }
            }
        }
        System.out.println(Arrays.toString(st));
    }
}
