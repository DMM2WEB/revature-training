package com.dmm.Day09;

//program to append the specified element to the end of a linked list

import java.util.LinkedList;

public class Exercise11 {
    public static void main(String[] args) {
        LinkedList <String> l_list = new LinkedList<String>();
        l_list.add("White");
        l_list.add("Black");
        l_list.add("Grey");
        System.out.println("Original linked list: " + l_list);

        l_list.add("Blue");
        System.out.println("Final linked list: " + l_list);
    }
}/*see https://www.w3resource.com/java-exercises/collection/java-collection-linked-list-exercise-8.php */
