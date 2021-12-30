package com.shsnk.section2;
//It's a example of inheritance and polymorphism
public class main {
    public static void main(String[] args) {
        //Inheritance
        bird phenixBird =new bird("phenix",2,true);
        System.out.println(phenixBird.getName());
        System.out.println(phenixBird.eat("meet"));
        System.out.println("Number of legs "+phenixBird.getLegs());
        dog pavilion =new dog("Oreo",4,true);
        System.out.println(pavilion.getName());
        System.out.println(pavilion.eat("Everything"));
        System.out.println("Number of legs "+pavilion.getLegs());
        //Here it's a example of polymorphism
        // In simple words, we can define polymorphism as the ability of a message to be displayed in more than one form
        PolymorphismEx poly=new PolymorphismEx();
        System.out.println("Addition is :"+poly.operation( 10,20,"Addition"));
        System.out.println("Subtraction is :"+poly.operation(20,10));
    }

}
