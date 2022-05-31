package com.dmm.Day09;

//program to insert the specified element at the specified position in the linked list

import java.util.LinkedList;

public class Exercise15 {
    public static void main(String[] args) {
        LinkedList<String> l_list = new LinkedList<String>();
        l_list.add("White");
        l_list.add("Black");
        l_list.add("Grey");
        l_list.add("Blue");
        l_list.add("Red");

        System.out.println("Original linked list: " + l_list);
        System.out.println("Inserting Yellow after Grey");
        l_list.add(3,"Yellow");
        System.out.println("Updated linked list: " + l_list);
    }
}/*see https://www.w3resource.com/java-exercises/collection/java-collection-linked-list-exercise-5.php */
