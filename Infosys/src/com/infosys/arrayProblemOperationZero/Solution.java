package com.infosys.arrayProblemOperationZero;
/*
* Question: Ali has a cyclic array consisting of N number where the last number is adjacent to
the first one.


In one operation Ali can Choose K Consecutive element and assign them to zero. The cost of
an operation is the sum of all element in the array equal to zero.

input format

The first line contain an integer, N denoting the number of element in A.The next line Contains
an integer, K Denoting of consecutive element Ali can change to zero in one operaion.
Each line i of the N subsequent line (where 0<=i<N) Contains an integer describing A[i}.

Sample Input:
4
1
4
1
8
2
Sample Output:
11

Explanation:
Since K equal 1,
it is optimal to apply the operation to larger element first
-apply to 8 cost 4+1+0+2=7
-apply to 4 cost 0+1+0+2=3
-apply to 2 cost 0+0+0+0=0
The total cost is 11.*/


import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();
        int []a=new int[n];
        int max=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int s=0,count=0;
        Solution.sol(a,n,k);
        while(true)
        {

            for(int i=0;i<a.length;i++)
            {
                if(a[i]>0)
                    count++;
            }
            if(count>0) {
                for (int i = 0; i < a.length; i++) {
                    s = s + a[i];
                }
                Solution.sol(a,n,k);

            }
            else
            {
                break;
            }
            count=0;
        }
        System.out.println(s);
    }
    public static void sol(int a[],int n,int k)
    {
        int max=0;
        for(int i=1;i<=k;i++)
        {
            max=a[0];
            int loc=0;
            for(int j=0;j<a.length;j++)
            {
                if(max<a[j])
                {
                    max=a[j];
                }
            }
            for(int q=0;q<a.length;q++)
            {
                if(max==a[q])
                {
                    a[q] = 0;
                    break;
                }
            }
        }
    }
}