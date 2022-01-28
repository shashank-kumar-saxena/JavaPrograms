package com.shshnk.Direction1;

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        int n = 0, e = 0, w = 0, s = 0;
        for (int i = 0; i < st.length(); i++)
        {
            char c = st.charAt(i);
            if (c == 'N')
                n++;
            else if (c == 'W')
                w++;
            else if (c == 'E')
                e++;
            else if (c == 'S')
                s++;
        }
        if (n > s)
        {
            n = n - s;
            s = 0;
        }
        else
        {
            if (s == n)
            {
                s = 0;
                n = 0;
            }
            else
            {
                s = s - n;
                n = 0;
            }
        }
        if (e > w)
        {
            e = e - w;
            w = 0;
        }
        else
        {
            if (e == w)
            {
                e = 0;
                w = 0;
            }
            else
            {
                w = w - e;
                e = 0;
            }
        }
        while (true)
        {
            if (e > 0)
            {
                System.out.print("E");
                e--;
            }
            else if (n > 0)
            {
                System.out.print("N");
                n--;
            }
            else if (s > 0)
            {
                System.out.print("S");
                s--;
            }
            else if (w > 0)
            {
                System.out.print("W");
                w--;
            }
            else
            {
                break;
            }
        }
    }
}
