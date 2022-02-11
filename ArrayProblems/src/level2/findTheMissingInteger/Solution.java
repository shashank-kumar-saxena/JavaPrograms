package level2.findTheMissingInteger;

import java.util.Arrays;
import java.util.Scanner;

/*
* Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.
*
* Input:
N = 5
A[] = {1,2,3,5}
Output: 4
*
* Input:
N = 5
A[] = {1,2,3,5}
Output: 4
*/
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        String st[]=s.split(",");
        int a[]=new int[st.length];
        for(int i=0;i<a.length;i++)
        {
            a[i]=Integer.parseInt(st[i]);
        }
        int count=0;
        Arrays.sort(a);
        for(int i=1;i<a[a.length-1];i++)
        {
            for(int j=0;j<a.length;j++)
            {
                if(a[j]==i)
                {
                    count++;
                }
            }
            if(count==0)
            {
                System.out.print(i+" ");
            }
            count=0;
        }
    }

}
