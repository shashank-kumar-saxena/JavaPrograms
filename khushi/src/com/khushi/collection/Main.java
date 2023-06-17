package com.khushi.collection;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Object> a=new ArrayList();
//        LinkedList<Object> a=new LinkedList<>();
//        Vector<Object> a=new Vector<>();
//        HashSet<Integer> a=new HashSet<>();
        TreeSet<Integer> a=new TreeSet<>();
        a.add(12);
        a.add(122);
        a.add(2);
        a.add(122);
 //       a.add(true);
 //       a.add("Shashank");
//        for(int i=0;i<a.size();i++)
//        {
//            System.out.println(a.get(i));
//        }
        for(Object i:a)
        {
            System.out.println(i);
        }
        //System.out.println(a.contains(222));
    }
}
