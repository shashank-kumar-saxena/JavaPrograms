package level2.largestSubArrayWithEqualNumberOfZeroAndOne;

import java.util.Scanner;

public class Solution {

        int findSubArray(int arr[], int n)
        {
            int sum = 0;
            int maxsize = -1, startindex = 0;
            int endindex = 0;

            for (int i = 0; i < n - 1; i++) {
                sum = (arr[i] == 0) ? -1 : 1;

                for (int j = i + 1; j < n; j++) {
                    if (arr[j] == 0)
                        sum += -1;
                    else
                        sum += 1;
                    if (sum == 0 && maxsize < j - i + 1) {
                        maxsize = j - i + 1;
                        startindex = i;
                    }
                }
            }
            endindex = startindex + maxsize - 1;
            if (maxsize == -1)
            {

            }
            else
                System.out.println(endindex);

            return maxsize;
        }
        public static void main(String[] args)
        {
            Solution sub=new Solution();
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int a[]=new int[n];
            String s=sc.next();
            int j=0;
            for(int i=0;i<s.length();i++)
            {
                char c=s.charAt(i);
                if(c=='1'||c=='0')
                    a[j++]=Integer.parseInt(String.valueOf(c));
            }
            sub.findSubArray(a,n);
        }
    }
