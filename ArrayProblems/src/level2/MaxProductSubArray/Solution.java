package level2.MaxProductSubArray;

import java.util.Scanner;
/*
* Given an array Arr[] that contains N integers (may be positive, negative or zero). Find the product of the maximum product subarray.
*
* Input:
N = 5
Arr[] = {6, -3, -10, 0, 2}
Output: 180
Explanation: Subarray with maximum product
is [6, -3, -10] which gives product as 180.
*
*
Input:
N = 6
Arr[] = {2, 3, 4, 5, -1, 0}
Output: 120
Explanation: Subarray with maximum product
is [2, 3, 4, 5] which gives product as 120.
* * */
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
                    c = c * a[k];
                }
                if (max<=c)
                {
                    max=c;
                }
                c = 1;
            }
        }
        System.out.println(max);
    }
}
