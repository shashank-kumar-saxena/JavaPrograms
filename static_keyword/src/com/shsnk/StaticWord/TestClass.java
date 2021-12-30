package com.shsnk.StaticWord;

public class TestClass {
    public static String name;//it's a object itself not the instance of that object
    private int No;
    private String skinColor;


    public static void Printing()
    {
        //------Note-----
        //We can't Call non-static function from static keyword
        System.out.println("Printing....");
    }
    public TestClass(int no, String skinColor) {
        No = no;
        this.skinColor = skinColor;
    }
    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        TestClass.name = name;
    }

    public int getNo() {
        return No;
    }

    public void setNo(int no) {
        No = no;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }
}
