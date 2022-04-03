package level2.LongestConsecutiveSubsequence;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
/*
* Given an array of positive integers. Find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers, the consecutive numbers can be in any order.

 * Input:
N = 7
a[] = {2,6,1,9,4,5,3}
Output:
6
Explanation:
The consecutive numbers here
are 1, 2, 3, 4, 5, 6. These 6
numbers form the longest consecutive
subsquence.
*
* Input:
N = 7
a[] = {1,9,3,10,4,20,2}
Output:
4
Explanation:
1, 2, 3, 4 is the longest
consecutive subsequence.*/
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        String s="",st="";
        Arrays.sort(a);
            for(int j=0;j<n-1;j++)
            {
                if(a[j]+1==a[j+1])
                {
                    System.out.println(a[j]+1+" "+a[j+1]);
                    s=s+Integer.toString(a[j]);
                }
                else
                    break;
            }
            if(s.length()>st.length())
            {
                System.out.println(s);
                System.out.println(s.length()+1);
            }

    }
}
