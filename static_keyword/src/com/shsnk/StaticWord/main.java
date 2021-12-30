package com.shsnk.StaticWord;

public class main {
    public static void main(String[] args) {
        TestClass testClass=new TestClass(12,"White");
        TestClass.name="Shashank";//static keyword
        System.out.println("Name :"+TestClass.getName());
        System.out.println("SkinColor :"+testClass.getSkinColor());
        TestClass.Printing();//function of static keyword
        }

}
