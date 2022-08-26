import java.util.HashMap;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="sssss";
        HashMap<Character,Integer> list=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            int count=list.containsKey(c)?list.get(c):0;
            count++;
            list.put(c,count);
        }
        for(char c:list.keySet())
        {
            System.out.println(c+" "+list.get(c));
        }

        int a[] = {2, 4, 1, 4, 6, 3, 5, 7, 9, 2,11,21,4,6,8,3,121,12,5,56};
        new Solution().mergeSort(a, 0, a.length-1);
        for (int i = 0; i < a.length; i++)
        {
            System.out.printf("%d ", a[i]);
        }
    }
    public void mergeSort(int a[], int l, int u)
    {
        if (l < u)
        {
            int m = l + (u - l) / 2;
            mergeSort(a, l, m);
            mergeSort(a, m + 1, u);
            merge(a, l, m, u);
        }
    }
    public void merge(int a[], int l, int m, int u)
    {
        int l1 = m - l + 1;
        int l2 = u - m;
        int b[]=new int[l1];
        int c[]=new int[l2];
        int i = 0, j = 0, k = l;
        for (i = 0; i < l1; i++)
        {
            b[i] = a[l + i];
        }
        for (i = 0; i < l2; i++)
        {
            c[i] = a[m + 1 + i];
        }
        i = 0;
        while (i < l1 && j < l2)
        {
            if (b[i] <= c[j])
            {
                a[k] = b[i++];
            }
            else
            {
                a[k] = c[j++];
            }
            k++;
        }
        while (i < l1)
        {
            a[k++] = b[i++];
        }
        while (j < l2)
        {
            a[k++] = c[j++];
        }
    }

}
