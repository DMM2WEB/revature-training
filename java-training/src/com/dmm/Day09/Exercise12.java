package com.dmm.Day09;

//program to iterate through all elements in a linked list

import java.util.Iterator;
import java.util.LinkedList;

public class Exercise12 {
    public static void main(String[] args) {
        LinkedList<String> l_list = new LinkedList<String>();
        l_list.add("White");
        l_list.add("Black");
        l_list.add("Grey");
        l_list.add("Blue");
        l_list.add("Red");

        Iterator it = l_list.listIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}/*see Exercise13 */
