package com.shsnk.AbsEg;

/*
three difference between abstract class and interface
1 : Abstract implies using extend keyword
2 : Multiple inheritance not available
3 : In Abstract Class functions can have body also
 */
public class TestClass extends AbsClass{
        String Name;
    @Override
    public void name(String Name) {
        this.Name=Name;
        System.out.println("Hello "+this.Name);
    }

}
