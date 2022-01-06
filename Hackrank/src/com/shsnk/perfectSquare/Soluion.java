package com.shsnk.perfectSquare;

import java.util.Scanner;

public class Soluion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int s=i*i;
            if(s<=n)
                System.out.print(s+" ");
            else
                break;

        }
    }
}
