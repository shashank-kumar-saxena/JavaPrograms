package com.shsnk.CaseSpecificSortingOFStrings;

import java.util.Arrays;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int i,posUpper=0,posLower=0;
        char c[]=s.toCharArray();
        for(i=0;i<s.length();i++)
        {
            char chr=s.charAt(i);
            if(Character.isUpperCase(chr)) {
                posUpper = i;
                break;
            }
        }
        for(;i<s.length();i++)
        {
            char chr=s.charAt(i);
            if(Character.isLowerCase(chr)) {
                posLower = i;
                break;
            }
        }

        c[posUpper-1]=s.charAt(posLower);
        c[posLower]=s.charAt(posUpper-1);

        for(i=1;i<c.length;i++)
        {
            for(int j=0;j<c.length;j++)
            {
                if(((int)c[i]>=97&&(int)c[i]<=122)&&((int)c[j]>=97&&(int)c[j]<=122))
                {
                    if(c[i]<c[j])
                    {
                        char ch=c[i];
                        c[i]=c[j];
                        c[j]=ch;
                    }
                }
                else if(((int)c[i]>=65&&(int)c[i]<=90)&&((int)c[j]>=65&&(int)c[j]<=90))
                {
                    if(c[i]<c[j])
                    {
                        char ch=c[i];
                        c[i]=c[j];
                        c[j]=ch;
                    }
                }
            }
        }
        for(char ci:c)
        {
            System.out.print(ci);
        }
    }
    }