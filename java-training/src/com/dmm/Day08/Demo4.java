package com.dmm.Day08;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo4 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Mark");
        names.add("Paul");
        names.add("Watson");

        //iterator
        Iterator iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //for-each
        System.out.println("---------");
        for (String name : names) {
            System.out.println(name);
        }

        //for
        System.out.println("---------");
        for (int i=0; i< names.size(); i++) {
            System.out.println(names.get(i));
        }

        //for-each
        System.out.println("---------");
        names.forEach(name -> System.out.println(name));
    }
}
