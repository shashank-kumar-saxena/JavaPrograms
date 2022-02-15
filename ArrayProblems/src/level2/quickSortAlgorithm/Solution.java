package level2.quickSortAlgorithm;
/*
* Quick Sort is a Divide and Conquer algorithm. It picks an element as pivot and partitions the given array around the picked pivot.
Given an array arr[], its starting position low and its ending position high.
*
* Implement the partition() and quickSort() functions to sort the array.
*
* Input:
N = 5
arr[] = { 4, 1, 3, 9, 7}
Output:
1 3 4 7 9
*
* Input:
N = 9
arr[] = { 2, 1, 6, 10, 4, 1, 3, 9, 7}
Output:
1 1 2 3 4 6 7 9 10
*
* Your Task:
You don't need to read input or print anything. Your task is to complete the functions partition()  and quickSort()
* which takes the array arr[], low and high as input parameters and partitions the array. Consider the last element as
* the pivot such that all the elements less than(or equal to) the pivot lie before it and the elements greater than it
* lie after the pivot.
*/
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        a=quickSort(a);
    }
    static int partition()
    {

    }
    static int[] quickSort(int a[])
    {
        int i=0,j=a.length;
        int pivot=a[0];

        while (i!=j)
        {
            if(pivot>a[j])
            {
                partition()
            }
        }
    }
}
