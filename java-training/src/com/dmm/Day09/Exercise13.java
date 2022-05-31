package com.dmm.Day09;

//program to iterate through all elements in a linked list starting at the specified position

import java.util.Iterator;
import java.util.LinkedList;

public class Exercise13 {
    public static void main(String[] args) {
        LinkedList<String> l_list = new LinkedList<String>();
        l_list.add("White");
        l_list.add("Black");
        l_list.add("Grey");
        l_list.add("Blue");
        l_list.add("Red");

        Iterator it = l_list.listIterator(2);
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}/*see https://www.w3resource.com/java-exercises/collection/java-collection-linked-list-exercise-3.php */
