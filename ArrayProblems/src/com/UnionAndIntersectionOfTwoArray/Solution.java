package com.UnionAndIntersectionOfTwoArray;

import java.util.ArrayList;
import java.util.Scanner;
/*Given two arrays a[] and b[] of size n and m respectively. The task is to find union between these two arrays.
* Union of the two arrays can be defined as the set containing distinct elements from both the arrays. If there
  are repetitions, then only one occurrence of element should be printed in the union
Input:
5 3
1 2 3 4 5
1 2 3
Output:
5
Explanation:
1, 2, 3, 4 and 5 are the
elements which comes in the union set
of both arrays. So count is 5.
* Input:
6 2
85 25 1 32 54 6
85 2
Output:
7
Explanation:
85, 25, 1, 32, 54, 6, and
2 are the elements which comes in the
union set of both arrays. So count is 7.*/
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m= sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[m];
        ArrayList<Integer> container=new ArrayList<>();
        a=assign(a,n);
        b=assign(b,m);
        for(int i:a)
        {
            container.add(i);
        }
        int count=0;
        for(int i=0;i<b.length;i++)
        {
            for(int j:container)
            {
                
            }
        }
    }
    static int[] assign(int[] a, int n)
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        return a;
    }

}
