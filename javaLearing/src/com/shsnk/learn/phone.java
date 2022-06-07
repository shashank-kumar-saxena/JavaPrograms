package com.shsnk.learn;

public class phone {
     static int count=0;
    public static void main(String[] args) throws InterruptedException {
        phone p=new phone();
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<2000;i++)
                {
                    p.incre();
                }
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<2000;i++)
                {
                    p.incre();
                }
            }
        },"Hello");
        t.start();

        t2.start();
        t.join();
        t2.join();;
        System.out.println(count);
        System.out.println(t2.getName());
    }
    public  void incre(){
        synchronized (this) {
            count++;
        }
    }
}
