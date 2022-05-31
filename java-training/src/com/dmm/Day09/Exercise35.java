package com.dmm.Day09;

//program to get the first and last elements in a tree set

import java.util.TreeSet;

public class Exercise35 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("White");
        treeSet.add("Black");
        treeSet.add("Grey");
        treeSet.add("Blue");
        treeSet.add("Red");
        System.out.println("Original tree set: " + treeSet);

        Object first_element = treeSet.first();
        System.out.println("First element of tree set is: " + first_element);

        Object last_element = treeSet.last();
        System.out.println("Last element of tree set is: " + last_element);
    }
}/*see https://www.w3resource.com/java-exercises/collection/java-collection-tree-set-exercise-5.php */
