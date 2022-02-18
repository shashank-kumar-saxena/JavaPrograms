package level2.StringProgramForKS;

import java.util.Locale;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine(),st="";
        if(s.length()>0)
        {
            s=s+" ";
            s=s.toUpperCase(Locale.ROOT);
            for(int i=0;i<s.length();i++)
            {
                char c=s.charAt(i);//use for extract particular character at ith location
                if(c==' ')
                {
                    System.out.println(st);
                    st="";
                }
                else {
                    st=st+c;
                }
            }
        }
        else
        {
            System.out.println(-1);
        }
    }
}
