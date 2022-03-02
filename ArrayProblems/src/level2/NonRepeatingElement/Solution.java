package level2.NonRepeatingElement;

import java.util.ArrayList;
import java.util.Scanner;
/*
* Find the first non-repeating element in a given array arr of N integers.
Note: Array consists of only positive and negative integers and not zero.
* Input : arr[] = {-1, 2, -1, 3, 2}
Output : 3
Explanation:
-1 and 2 are repeating whereas 3 is
the only number occuring once.
Hence, the output is 3.
*
* Input : arr[] = {1, 1, 1}
Output : 0
*/
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        ArrayList<Integer> list=new ArrayList<>();
        String st[]=s.split(",");
        int arr[]=new int[st.length];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=Integer.parseInt(st[i]);
        }
        int count=0,fre=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                    arr[j]=0;
                }
            }
            if(count==0&&arr[i]!=0)
            {
                fre++;
                list.add(arr[i]);
            }
            count=0;
        }
        if(fre>0)
        for (int i:list) {
            System.out.print(i+" ");
        }
        else
            System.out.println(-1);
    }
}
