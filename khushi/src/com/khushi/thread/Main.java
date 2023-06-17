package com.khushi.thread;
class A extends Thread{
    @Override
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.print(i+" ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class B extends Thread{
    @Override
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.print(i+" ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        a.start();
        b.start();
    }
}
