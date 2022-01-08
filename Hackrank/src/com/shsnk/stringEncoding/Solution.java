package com.shsnk.stringEncoding;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st="",s=sc.next();
        int count=1;
        s=s+" ";
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i-1)==s.charAt(i))
            {
                count++;
            }
            else
            {
                st=st+s.charAt(i-1);
                st=st+Integer.toString(count);
                count=1;
            }

        }
        System.out.println(st);
    }
}