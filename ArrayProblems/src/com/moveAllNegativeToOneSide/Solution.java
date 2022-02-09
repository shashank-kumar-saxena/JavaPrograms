package com.moveAllNegativeToOneSide;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
* Given an unsorted array arr[] of size N having both negative and positive integers. The task is place all negative
* element at the end of array without changing the order of positive element and negative element

* Input :
N = 8
arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
Output :
1  3  2  11  6  -1  -7  -5

Input :
N=8
arr[] = {-5, 7, -3, -4, 9, 10, -1, 11}
Output :
7  9  10  11  -5  -3  -4  -1
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i< arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=0)
            {
                pos.add(arr[i]);
            }
            else
            {
                neg.add(arr[i]);
            }
        }
//        Collections.sort(pos);
//        Collections.sort(neg);
        Arrays.sort(new ArrayList[]{neg});
        for(int i:pos)
        {
            System.out.print(i+" ");
        }
        for(int i:neg)
        {
            System.out.print(i+" ");
        }
    }
}
