package com.shsnk.section3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        /*Another way of defining the array List
         *     ----- List<String> name = new ArrayList<>();-----
         */
        name.add("Shashank");//add() method
        name.add("Saxena");
        name.add("ashu");
        name.add("Choudhary");
        System.out.println("After Adding Element :"+name.get(0)+" "+ name.get(1));//get() Method
        System.out.println("Lenght Of ArrayList :"+ name.size());//size() method
        System.out.println("after Removing element "+ name.remove(0));
        System.out.println(name.size());
        System.out.println(name.isEmpty());
        System.out.println(name.indexOf("Saxena"));
        for(int i=0;i<name.size();i++)
        {
            System.out.println(name.get(i));
        }
        System.out.println();
        Map<Integer,String> names=new HashMap<>();
        names.put(1,"shashank");
        names.put(2,"Kumar");
        names.put(3,"Saxena");

        System.out.println(names.get(3));
        System.out.println(names.containsKey(2));
        System.out.println(names.containsValue("saxena"));


        ArrayList<student> students =new ArrayList<>();//passing students in array list
        students.add(new student("shashank",1212));//here we also create instance of the class
        students.add(new student("Ansh",2121));//here we also create instance of the class
        //------For each loop-----
        for(student s: students)
        {
            System.out.println(s.getName() + " "+s.getId());
        }
    }
   }
