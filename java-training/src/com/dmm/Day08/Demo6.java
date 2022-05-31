package com.dmm.Day08;

import java.util.ArrayList;

public class Demo6 {
    public static void main(String[] args) {
        ArrayList <String> names = new ArrayList<>();
        names.add("Mark");
        names.add("Paul");
        names.add("Watson");

        System.out.println(names);

        //getting element on a specific index
        System.out.println(names.get(1)); //Paul

        //adding the element o specific index
        names.add (1, "John");
        System.out.println(names);

        //merge two list
        ArrayList<String> newName = new ArrayList<>();
        newName.add ("Smith");
        newName.add("Stacy");

        names.addAll(newName);
        System.out.println(names);

        //adding the second list elements to the specified position
        names.addAll(0, newName);
        System.out.println(names);

        //remove
        names.remove("Mark");
        System.out.println(names);

        //removeAt()
        names.remove(0);
        System.out.println(names);

        //removing the element based on condition
        names.removeIf(name -> name.contains("Paul"));
        System.out.println(names);
    }
}
