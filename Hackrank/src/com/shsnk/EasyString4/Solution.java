package com.shsnk.EasyString4;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//aaABBb
//A3b3
//3a3b
public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st="",s=sc.next();
        int count=1;
        s=s+" ";
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i-1)==s.charAt(i)||(((int)(s.charAt(i-1)))-32)==s.charAt(i)||(((int)(s.charAt(i)))-32)==s.charAt(i-1))
            {
                count++;
            }
            else
            {
                st=st+s.charAt(i);
                st=st+Integer.toString(count);
                count=1;
            }

        }
        System.out.println(st);
    }
}