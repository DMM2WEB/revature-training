package com.dmm.Day09;

//program to create a reverse order view of the elements contained in a given tree set

import java.util.Iterator;
import java.util.TreeSet;

public class Exercise34 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("White");
        treeSet.add("Black");
        treeSet.add("Grey");
        treeSet.add("Blue");
        treeSet.add("Red");
        System.out.println("Original tree set: " + treeSet);

        Iterator it = treeSet.descendingIterator();
        System.out.println("Elements in reverse order: ");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}/*see https://www.w3resource.com/java-exercises/collection/java-collection-tree-set-exercise-4.php */
