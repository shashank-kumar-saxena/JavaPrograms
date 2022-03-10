package level2.subArrayWithEqual1sAnd0s;

import java.util.ArrayList;
import java.util.Scanner;
/*
* Given an array containing 0s and 1s. Find the number of subarrays having equal number of 0s and 1s.
*
* Input:
n = 7
A[] = {1,0,0,1,0,1,1}
Output: 8
Explanation: The index range for the 8
sub-arrays are: (0, 1), (2, 3), (0, 3), (3, 4),
(4, 5) ,(2, 5), (0, 5), (1, 6)
*
* Input:
n = 5
A[] = {1,1,1,1,0}
Output: 1
Explanation: The index range for the
subarray is (3,4). */
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println(count(a));
    }
    static int count(int a[])
    {
        ArrayList<String> list =new ArrayList<>();
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                    if ((!list.isEmpty())) {
                        int error = 0;
                        String s = Integer.toString(a[i]) + Integer.toString(a[j]);
                        for (int l=count;l<list.size();l++) {
                            if (s.equals(list.get(l))) {
                                error++;
                                break;
                            }
                        }
                        if (error == 0) {
                            list.add(s);
                            count++;
                        }
                    } else {
                        list.add(Integer.toString(a[i]) + Integer.toString(a[j]));
                    }
                }
            }

        for(int i=0;i< list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
        return list.size();
    }
}
