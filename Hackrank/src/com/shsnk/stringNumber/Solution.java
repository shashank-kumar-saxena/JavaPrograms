package com.shsnk.stringNumber;

import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Solution solution=new Solution();
        int n=sc.nextInt();
        int res,j=0;
        //J variable use for seperate
        for(int i=1;i<=n;i++)
        {
            res=solution.strong(i);
            if(res==i)
                System.out.print(res+" ");
        }
    }
    public int strong(int n)
    {
        int s=0,fac=1;
        while(n>0)
        {
            int r=n%10;
            while(r>0)
            {
                fac=fac*(r--);
            }
            s=s+fac;
            n/=10;
            fac=1;
        }
        return(s);
    }

}
