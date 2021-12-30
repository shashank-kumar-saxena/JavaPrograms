package com.shsnk.interfaceEg;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Fun mathFun=new Fun();----it''s a first method but by using this method we have to override our interface function
        //Another Method
        Fun fun = new MathFun();//interface
        MathFun mathFun=new MathFun();
        //Here arrayList
        //List<String> st=new ArrayList<>();
        //probably now you understand it
         mathFun.setA(12);
         mathFun.setB(10);
         fun.packageName();
        System.out.println("Addition :" + fun.add(12,10));//Here We Use Interface
        mathFun.setValue();
    }
}
