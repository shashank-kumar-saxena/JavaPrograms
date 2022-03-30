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

import java.util.Arrays;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int l=arr.length;
        int k=sc.nextInt();
        Arrays.sort(arr);
        int ele=l>0?arr[k-1]:arr[k];
        System.out.println(ele);
    }


}
