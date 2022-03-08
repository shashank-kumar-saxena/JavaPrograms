package com.hackWithInfy;

import java.util.Scanner;

public class MyCode {
    public static int distinctPersons(String s)
    {
            int freOne=0,freZero=0;
            for(int i=0;i<s.length();i++)
            {
                char c=s.charAt(i);
                if(c=='1')
                {
                    freOne++;
                }
                else if(c=='0')
                {
                    freZero++;
                }
            }
            if(freOne>freZero)
            {
                return(freOne-freZero);
            }
            else
            {
                return(freZero-freOne);
            }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
            int result=distinctPersons(s);
        System.out.println(result);
    }
}
