package level2.AlternaivePositiveAndNegative;

import java.util.ArrayList;
import java.util.Scanner;

/*
* Given an unsorted array Arr of N positive and negative numbers. Your task is to create an array of alternate positive
* and negative numbers without changing the relative order of positive and negative numbers.
  Note: Array should start with positive number.
  *
  * Input:
    N = 9
    Arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2}
    Output:
    9 -2 4 -1 5 -5 0 -3 2
    *
    * Input:
        N = 10
        Arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8}
        Output:
        5 -5 2 -2 4 -8 7 1 8 0 */
public class Solution {
    static ArrayList<Integer> posList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        boolean c = true;//use for alter the function where true means posAdd function run otherwise negAdd work
        ArrayList<Integer> list = new ArrayList<>();
        int num;
        for (int i = 0; i < n; i++) {
            if (c) {
                num = posAdd(a, i);
                c = false;
            } else {
                num = negAdd(a, i);
                c = true;
            }
            list.add(num);

        }

        for (int i : list)
            System.out.print(i + " ");
    }

    static int posAdd(int a[], int i) {
        for (i = 0; i < a.length; i++) {
            if (a[i] >= 0) {
                if (!posList.isEmpty()) {
                    if (!posList.contains(i)) {
                        posList.add(i);
                        return a[i];
                    }
                    continue;
                } else {
                    posList.add(i);
                    return a[i];
                }
            }
        }
        return 0;
    }

    static int negAdd(int a[], int i) {
        for (i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                if (!posList.isEmpty()) {
                    if (!posList.contains(i)) {
                        posList.add(i);
                        return a[i];
                    }
                    continue;
                } else {
                    posList.add(i);
                    return a[i];
                }
            }
        }
        return 0;
    }
}
