package com.infosys.commanArray;

import java.util.Scanner;

public class myCode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next(),st=sc.next();
        String s1[]=s.split(",");
        String st2[]=s.split(",");
        String str="";int count=0;
        for(int i=0;i<s1.length;i++)
        {
            for(int j=0;j<st2.length;j++)
            {
                if(s1[i]==st2[j])
                {
                    str=s1[i]+',';
                    count++;
                    break;
                }
            }
        }
        if(count>1)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(-1);
        }
    }
}
