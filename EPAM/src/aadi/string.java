package aadi;

import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = "";
        long n=0;
        try {
             s=sc.next();
            n=sc.nextLong();
        }catch (Exception e)
        {
            System.out.println(n);
        }
        long len=s.length();
        int count=0;
        for(int i=0;i<len;i++)
        {
            if(s.charAt(i)=='a')
            {
                ++count;
            }
        }
        long rt=n/len;
        long sfl=n-(len*rt);
        int extra=0;
        for(int i=0;i<sfl;i++)
        {
            if(s.charAt(i)=='a') {
                ++extra;
            }
        }
        long totalC=(rt*count)+extra;
        System.out.println(totalC);
    }
}
