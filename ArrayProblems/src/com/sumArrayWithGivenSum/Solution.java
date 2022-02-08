package com.sumArrayWithGivenSum;
/*
* Given an unsorted array A of size N that contains only non-negative
* integers, find a continuous sub-array which adds to a given number S.
* Input:
N = 5, S = 12
A[] = {1,2,3,7,5}
Output: 2 4
Explanation: The sum of elements
from 2nd position to 4th position
is 12.
* Input:
N = 10, S = 15
A[] = {1,2,3,4,5,6,7,8,9,10}
Output: 1 5
Explanation: The sum of elements
from 1st position to 5th position
is 15.*/
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        int s=sc.nextInt(),add=0,i=0,j=0;
        Arrays.sort(a);
        int flag=0;
        for(i=0;i<a.length;i++)
        {
            for( j=i;j<a.length;j++)
            {
                add=add+a[j];
                if(add==s)
                {
                   flag=1;
                   break;
                }
            }

            if (flag==1)
            {
                break;
            }
            add=0;
        }
        if(flag==1)
        {
            while (i<=j)
            {
                System.out.print(a[i]+" ");
                i++;
            }
        }
        else
        {
            System.out.println("NO");
        }
    }
}
