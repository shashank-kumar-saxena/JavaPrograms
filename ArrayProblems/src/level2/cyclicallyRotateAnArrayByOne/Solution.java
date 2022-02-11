package level2.cyclicallyRotateAnArrayByOne;

import java.util.ArrayList;
import java.util.Scanner;

/*
*Given an array, rotate the array by one position in clock-wise direction
* Input:
N = 5
A[] = {1, 2, 3, 4, 5}
Output:
5 1 2 3 4
*
Input:
N = 8
A[] = {9, 8, 7, 6, 4, 2, 1, 3}
Output:
3 9 8 7 6 4 2 1
* */
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        int []b=new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            if(i==a.length-1)
            {
                b[0]=a[a.length-1];
            }
            else {
                b[i+1]=a[i];
            }
        }
        for(int i:b)
        {
            System.out.print(i+" ");
        }
    }
}
