package com.shsnk.playWithString;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.next();
        char a[]=st.toCharArray();
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            if(Character.isDigit(a[i]))
            {
                sum=sum+Integer.parseInt(String.valueOf(a[i]));
            }
            else
            {
                for(int j=i+1;j<a.length;j++)
                {
                    if(((int)a[i]>(int)a[j])&&!(Character.isDigit(a[j])))
                    {
                        char c=a[i];
                        a[i]=a[j];
                        a[j]=c;
                    }
                }
            }
        }
        for (char i:a)
        {
            if(!(Character.isDigit(i)))
            System.out.print(i);
        }
        System.out.println(sum);
    }
}
