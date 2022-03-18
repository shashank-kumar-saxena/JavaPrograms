package level2.subArrayWith0Sum;

import java.util.Scanner;

/*
* Given an array of positive and negative numbers. Find if there is a subarray (of size at-least one) with 0 sum.
*
    * Input:
    5
    4 2 -3 1 6

    Output:
    Yes

    Explanation:
    2, -3, 1 is the subarray
    with sum 0.
*
*
    * Input:
    5
    4 2 0 1 6

    Output:
    Yes

    Explanation:
    0 is one of the element
    in the array so there exist a
    subarray with sum 0.*/
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int c=-1;
        String st="";
        boolean b=false;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    c=c+a[k];
                    st=st+Integer.toString(a[k])+" ";
                }
                c++;
                if(c==0&&st.length()>0)
                {
                    b=true;
                    System.out.println(st);
                    break;
                }
                c=-1;
                st="";
            }
            if(b)
                break;
        }
        if(!b)
            System.out.println(-1);
    }
}
