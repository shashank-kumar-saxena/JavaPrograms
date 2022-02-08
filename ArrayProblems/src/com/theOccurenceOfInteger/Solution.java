package com.theOccurenceOfInteger;
/*
* Given a vector of N positive integers and an integer X. The task is to find the frequency of X in vector.
* Input:
N = 5
vector = {1, 1, 1, 1, 1}
X = 1
Output:
5
Explanation: Frequency of 1 is 5.
*/
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
        int x=sc.nextInt();
        int freq=find(a,x);

        System.out.println(freq);
    }
    public static int find(int a[],int x)
    {
        int count=0;
        for(int i:a)
        {
            if(i==x)
            {
                count++;
            }
        }
        if(count>0)
        {
            return count;
        }
        else
        {
            return 0;
        }
    }
}
