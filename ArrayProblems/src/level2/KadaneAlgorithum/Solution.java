package level2.KadaneAlgorithum;

import java.util.Scanner;

/*
* Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the
* maximum sum and return its sum.

* Input:
N = 5
Arr[] = {1,2,3,-2,5}
Output:
9
Explanation:
Max subarray sum is 9
of elements (1, 2, 3, -2, 5) which
is a contiguous subarray.
*
* Input:
N = 4
Arr[] = {-1,-2,-3,-4}
Output:
-1
Explanation:
Max subarray sum is -1
of element (-1)
*/
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int c = 0, max=0;
        String st = "";
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    c = c + a[k];
                }
                if (max<=c)
                {
                    max=c;
                }
                c = 0;
            }
        }
        System.out.println(max);
    }
}