package com.AliceAndBob;

import java.util.*;

import static java.util.stream.Collectors.toList;

public class MyCode {
    public static String solve(int M,List<List<Integer>> Queries)
    {
        String st="";
        for(int i = 0; i < Queries.size(); i++) {
            for (int j = 0; j < Queries.get(i).size(); j++) {
                st=st+Integer.toString(Queries.get(i).get(j) )+" ";
            }

        }

        String s[]=st.split(" ");
        st="";
        for(int i=0;i<s.length;i+=2)
        {
            int n1=Integer.parseInt(s[i]);
            int n2=Integer.parseInt(s[i+1]);
            if(n2>=n1)
            {
                st=st+"A";
            }
            else if(n1>n2)
            {
                st=st+"B";
            }
        }
        return st;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int M= Integer.parseInt(sc.nextLine().trim());
        List<List<Integer>> Queries =new ArrayList<>(M);
        for(int i=0;i<M;i++)
        {
            Queries.add(
                    Arrays.asList(sc.nextLine().trim().split(" ")).stream().map(s->Integer.parseInt(s)).collect(toList())
            );
        }
        String result=solve(M,Queries);
        System.out.println(result);
    }
}
