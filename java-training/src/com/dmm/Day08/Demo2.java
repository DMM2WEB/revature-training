package com.dmm.Day08;

import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Mark");
        names.add("Paul");
        names.add("Watson");

        System.out.println(names);

        //get()
        System.out.println(names.get(1)); //Paul


        //set()
        names.set(1, "Paul Smith");

        System.out.println(names);

        for (String name : names) {
            System.out.println(name);
        }
    }
}
