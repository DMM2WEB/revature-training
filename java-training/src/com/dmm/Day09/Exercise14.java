package com.dmm.Day09;

//program to iterate a linked list in reverse order

import java.util.Iterator;
import java.util.LinkedList;

public class Exercise14 {
    public static void main(String[] args) {
        LinkedList<String> l_list = new LinkedList<String>();
        l_list.add("White");
        l_list.add("Black");
        l_list.add("Grey");
        l_list.add("Blue");
        l_list.add("Red");

        System.out.println("Original linked list: " + l_list);

        Iterator it = l_list.descendingIterator();

        System.out.println("Elements in reverse order: ");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}/*see https://www.w3resource.com/java-exercises/collection/java-collection-linked-list-exercise-4.php */
