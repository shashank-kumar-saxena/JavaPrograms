package com.infosys.nonEmptyString;

import java.util.Scanner;

public class myCode {
    public static void main(String[] args) {
        //design bt shashank
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        int maxAsciiNum=0,maxAsciiSmall=0,maxAsciiCap=0;
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(Character.isDigit(ch))
            {
                if(maxAsciiNum<(int)ch)
                {
                    maxAsciiNum=(int)ch;
                }

            }
            if(Character.isUpperCase(ch))
            {
                if(maxAsciiCap<(int)ch)
                {
                    maxAsciiCap=(int)ch;
                }
            }
            if(Character.isLowerCase(ch))
            {
                if(maxAsciiSmall<(int)ch)
                {
                    maxAsciiSmall=(int)ch;
                }
            }
        }
        int maxLetter;
        if(maxAsciiCap>maxAsciiSmall)
        {
            maxLetter=maxAsciiCap;
        }
        else
        {
            maxLetter=maxAsciiSmall;
        }
        int freCap=0,freqNum=0;
        for(int i=0;i<st.length();i++)
        {
            int ch=(int)(st.charAt(i));
            if(ch==maxLetter&&maxLetter!=0)
            {
                freCap++;
            }
            else if(ch==(char)maxAsciiNum&&maxAsciiNum!=0)
            {
                freqNum++;
            }
        }
        int diff=0;
        if(freCap>freqNum)
        {
            diff=freCap-freqNum;
        }
        else
        {
            diff=freqNum-freCap;
        }
        String str="";
        char specialIndex=st.charAt(diff);
        for(int i=0;i<st.length();i++)
        {
            char chr=st.charAt(i);
            if(chr==' ')
            {
                str=str+'$';
            }
            else if(chr==specialIndex)
            {
                continue;
            }
            else
            {
                str=str+chr;
            }
        }
        System.out.println(str);
    }
}
