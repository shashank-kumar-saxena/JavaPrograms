package com.infosys.inmatrix;

import java.util.Scanner;

public class myCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][100];
        String st = "";
        int len;
        for (int i = 0; i < n; i++) {
            st = sc.next();
            String[] arr2 = st.split(",");
            len = arr2.length;
            for (int j = 0; j < st.length() / 2 + 1; j++) {
                a[i][j] = Integer.parseInt(arr2[j]);
            }
        }
        //Made by Shashank kumar
        maxRectangle(n, st.length()/2+1, a);
    }

    static void maxRectangle(int r,int c,int M[][])
    {
        int i,j;
        int R = r;
        int C = c;
        int S[][] = new int[R][C];

        int max_of_s, max_i, max_j;
        for(i = 0; i < R; i++)
            S[i][0] = M[i][0];

        /* Set first row of S[][]*/
        for(j = 0; j < C; j++)
            S[0][j] = M[0][j];

        for(i = 1; i < R; i++)
        {
            for(j = 1; j < C; j++)
            {
                if(M[i][j] == 1)
                    S[i][j] = Math.min(S[i][j-1],
                            Math.min(S[i-1][j], S[i-1][j-1])) + 1;
                else
                    S[i][j] = 0;
            }
        }
        max_of_s = S[0][0]; max_i = 0; max_j = 0;
        for(i = 0; i < R; i++)
        {
            for(j = 0; j < C; j++)
            {
                if(max_of_s < S[i][j])
                {
                    max_of_s = S[i][j];
                    max_i = i;
                    max_j = j;
                }
            }
        }
        int count=0;
            for(i = max_i; i > max_i - max_of_s; i--)
            {
                for(j = max_j; j > max_j - max_of_s; j--)
                {
                    count++;
                }
            }
            if(count>1)
                System.out.println(count);
            else
                System.out.println("-1");
    }
}
