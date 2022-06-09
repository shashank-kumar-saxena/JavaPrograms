package com.shsnk.learn;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
     String s="dvdf";
        int flag=0;
        HashSet<Character> map=new HashSet<>();
        int maxLength=0;
        char a[]=s.toCharArray();
        String st="";
        for(int i=0;i<a.length;i++)
        {
            if(a[i]=='/')
            {
                continue;
            }
            if((!(map.contains(a[i])))&&(i+1)==a.length)
            {
                st=st+a[i];
            }
            if(map.contains(a[i])||(i+1)==a.length)
            {
                flag=1;
                if(maxLength<st.length())
                {
                    maxLength=st.length();
                }
                st="";
                for(int j=0;j<a.length;j++)
                {
                    if(a[i]==a[j])
                    {
                        a[j]='/';

                        break;
                    }
                }
                map.clear();
            }
            st=st+a[i];
            map.add(a[i]);
        }
        if(flag==1)
            System.out.println(maxLength);
        else {
            System.out.println(s.length());
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
