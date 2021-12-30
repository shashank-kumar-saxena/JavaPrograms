package com.shsnk.interfaceEg;

public class MathFun implements Fun {
    /*
    Suppose if we want to use multiple Interface simultaious
    then
    ---------------------------Syntax------------------------------

                  public class MathFun implements Fun,SecondInterface
     */
    public int a,b;

    @Override
    public int sub(int a, int b) {
        return a-b;
    }

    @Override
    public void packageName() {
        System.out.println("Here We Showing Package :"+this);
    }

    public void setValue()
    {
       int c= add(a,b);
       int d= sub(a,b);
        System.out.println("Addition :" + c);
        System.out.println("Subtraction :" + d);
    }
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    @Override
    public int add(int a, int b) {
        return  a+b;

    }
}
