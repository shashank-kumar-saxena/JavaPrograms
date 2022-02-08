/*
* Given an array arr[] and an integer K where K is smaller than size of array, the task is to find the Kth smallest element in
*  the given array. It is given that all array elements are distinct.
* Input:
N = 6
arr[] = 7 10 4 3 20 15
K = 3
Output : 7
Explanation :
3rd smallest element in the given
array is 7.
* Input:
N = 5
arr[] = 7 10 4 20 15
K = 4
Output : 15
Explanation :
4th smallest ele*/
package com.shsnk.kthMininumElement;

import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int max=Arrays.;
        int k=sc.nextInt();
        for(int j=0;j<k;j++)
        {
            int n=max(a,max);
            max=n;
        }
    }
    static int max(int a[],int max)
    {
        for(int i=0;i<a.length;i++)
        {
            if(max<)
        }
    }
}
