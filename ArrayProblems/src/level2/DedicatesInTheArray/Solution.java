package level2.DedicatesInTheArray;

import java.util.ArrayList;
import java.util.Scanner;

/*
* Given an array a[] of size N which contains elements from 0 to N-1, you need to find all the elements occurring more
* than once in the given array.
*
* Input:
N = 4
a[] = {0,3,1,2}
Output: -1
Explanation: N=4 and all elements from 0
to (N-1 = 3) are present in the given
array. Therefore output is -1.
*
* Input:
N = 5
a[] = {2,3,1,2,3}
Output: 2 3
Explanation: 2 and 3 occur more than once
in the given array
* */
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j]&&listCheck(list,a[i]))
                {
                    list.add(a[i]);
                    break;
                }
            }
        }
        if(list.isEmpty())
        {
            System.out.println(-1);
        }
        else
        {
            for(int i: list)
            {
                System.out.print(i+" ");
            }
        }
    }

    static boolean listCheck(ArrayList<Integer> list,int n) {
        if(list.isEmpty())
        {
            return true;
        }
        else
        {
            for(int i: list)
            {
                if(i==n)
                {
                    return false;
                }
            }
            return true;
        }
    }

}
