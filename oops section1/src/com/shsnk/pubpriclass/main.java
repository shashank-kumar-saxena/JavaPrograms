package com.shsnk.pubpriclass;
//it's a example of private and public variable and also constructor
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Enter Your Name");
        Scanner s=new Scanner(System.in);
        String nm=s.next();
        obj ob=new obj();
        ob.setString(nm);
        System.out.println(ob.getString());
        //Constructor Example start from here
        cons iPhone=new cons("Iphone","4 GB","128 GB");
        cons gPixel=new cons("Pixel 3Xl","8 GB","256 GB");
        iPhone.getAll();
        gPixel.getAll();
    }
}
