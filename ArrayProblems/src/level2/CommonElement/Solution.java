package level2.CommonElement;

import java.util.ArrayList;
import java.util.Scanner;
/*
*   Given three arrays sorted in increasing order. Find the elements that are common in all three arrays.
    Note: can you take care of the duplicates without using any additional Data Structure?
*
* Input:
n1 = 6; A = {1, 5, 10, 20, 40, 80}
n2 = 5; B = {6, 7, 20, 80, 100}
n3 = 8; C = {3, 4, 15, 20, 30, 70, 80, 120}
Output: 20 80
Explanation: 20 and 80 are the only
common elements in A, B and C.
* */
public class Solution {
    public static void main(String[] args) {
        int n1,n2,n3;
        n1=inputArraysize();
        n2=inputArraysize();
        n3=inputArraysize();
        int a[]=new int[n1];
        int b[]=new int[n2];
        int c[]=new int[n3];
        a=inputArray(n1);
        b=inputArray(n2);
        c=inputArray(n3);
        ArrayList<Integer> list= new ArrayList<>();
        int count=0,count2=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
                if(a[i]==a[j])
                {
                    count++;
                    break;
                }
            }
            if(count>0)
            {
                count=0;
                for(int k=0;k<c.length;k++)
                {
                    if(a[i]==a[k])
                    {

                    }
                }
            }
        }
    }
    static int[] inputArray(int n)
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        return a;
    }
    static int inputArraysize()
    {
        Scanner sc=new Scanner(System.in);
        return (sc.nextInt());
    }
}
