package level2.FirstRepeatingElement;

import java.util.Scanner;
/*
* Given an array arr[] of size n, find the first repeating element. The element should occurs more than once and the index
* of its first occurrence should be the smallest.
* Input:
n = 7
arr[] = {1, 5, 3, 4, 3, 5, 6}
Output: 2
Explanation:
5 is appearing twice and
its first appearence is at index 2
which is less than 3
*
* Input:
n = 4
arr[] = {1, 2, 3, 4}
Output: -1
Explanation:
All elements appear only once so
answer is -1.*/
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    count++;
                }
            }
            if(count>0)
            {
                break;
            }
        }
        int flag=count>0?++count:-1;
        System.out.println(flag);
    }
}
