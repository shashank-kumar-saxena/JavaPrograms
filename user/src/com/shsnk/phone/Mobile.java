package com.shsnk.phone;

public class Mobile {
    public static void main(String[] args) {
        Phone iphone=new Phone("13","3GB","128GB");
        Phone pixel=new Phone("4xl","4gb","128gb");
        System.out.println(iphone.getName());
        iphone.setRam("4gb");
        System.out.println(iphone.getRam());
    }
}
