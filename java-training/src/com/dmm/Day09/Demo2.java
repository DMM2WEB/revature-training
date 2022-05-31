package com.dmm.Day09;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo2 {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Mark");
        names.add("Paul");
        names.add("Watson");
        System.out.println(names);

        //adding element at specific position
        names.add(0, "John");
        System.out.println(names);

        //second list
        LinkedList <String> newNames = new LinkedList<>();
        newNames.add("Rangel");
        newNames.add("Stacy");

        names.addAll(newNames);
        System.out.println(names);

        //add First ()
        names.addFirst("First");
        System.out.println(names);

        //add Last ()
        names.addLast("Last");
        System.out.println(names);

        //remove()
        //removeFirst()
        //removeLast(()
        //removeFirstOccurrence
        //removeLastOccurrence

        System.out.println("_________");

        names.add("Paul");
        names.add("John");
        System.out.println(names);

        names.removeLastOccurrence("Paul");
        names.removeFirstOccurrence("John");
        System.out.println(names);

        //reverse element
        System.out.println("Original");
        System.out.println(names);

        //traversing list element to reverse order
        Iterator iterator = names.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(" " + iterator.next());
        }

        System.out.println("_________");

        for (int i=names.size() - 1; i>=0; i--) {
            System.out.println(" " + names.get(i));
        }
    }
}
