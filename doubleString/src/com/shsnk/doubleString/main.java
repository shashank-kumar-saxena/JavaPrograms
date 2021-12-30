package com.shsnk.doubleString;

public class main {
    public static void main(String[] args) {
        Double d=123.45;
        int pos=0;
        char ch;
        String s=Double.toString(d),st="";
        for(int i=s.length()-1;i>=0;i--)
        {
            char c=s.charAt(i);
            if(c=='.')
            {
                ch=c;
                pos=s.length()-i-1;
                continue;
            }
            if(i==pos)
            {
                st=st+'.';
                pos=1000;
                i++;
            }
else
            {
                st=st+c;

            }
        }
        System.out.println("st"+st);
    }
}
