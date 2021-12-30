package com.shsnk.palinDecBin;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String st="",str="";
        int cpy = n, s = 0,r=0;
        while (cpy > 0) {
            r=cpy % 2;
            st=Integer.toString(r);
            str=st+str;
            cpy /= 2;
        }
        int c=Integer.parseInt(str);
        Solution solution=new Solution();
       int k=solution.palin(c);
       int k2=solution.palin(n);
       if(k==1&&k2==1)
       {
           System.out.println("Yes");
       }
       else
           System.out.println("No");
    }
    public int palin(int n)
    {
        int s=0,r=0,cpy=n;
        while(n>0)
        {
            r=n%10;
            s=(s*10)+r;
            n/=10;
        }
        if(cpy==s)
            return 1;
        return 0;
    }
}
