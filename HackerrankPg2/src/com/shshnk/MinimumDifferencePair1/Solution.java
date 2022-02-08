package com.shshnk.MinimumDifferencePair1;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String st[]=s.split(" ");
        Arrays.sort(st);
        int min=Integer.parseInt(st[0])-Integer.parseInt(st[1])+100;
        for(int i=1;i<st.length;i++)
        {
            int a=Integer.parseInt(st[i])-Integer.parseInt(st[i-1]);
            if(min>=a)
            {
                min=a;
            }
        }
        System.out.println(min);
    }
}
