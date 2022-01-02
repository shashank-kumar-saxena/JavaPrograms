package com.shsnk.happyNumber;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Solution solution=new Solution();
        int n=sc.nextInt(),r,s=0,flag=0;
        while(true)
        {
            r=solution.happy(n);
            n=r;
            while(r>0)
            {
                s=s*10+(r%10);
                r/=10;
            }
                if(s<=9)
                {
                    if(s==1) {
                        flag=1;
                        break;
                    }
                    else
                    {
                        flag=0;
                        break;
                    }
                }
                s=0;

        }
        if(flag==1)
            System.out.println('1');
        else
            System.out.println('0');

    }
    public int happy(int n)
    {
        int s=0,r=0;
        while(n>0)
        {
            r=n%10;
            s=(int)(s+Math.pow(r,2));
            n/=10;
        }

        return (s);
    }
}

