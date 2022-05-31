package com.dmm.Day09;

//program to create a new tree set, add some colors (string) and print out the tree set

import java.util.TreeSet;

public class Exercise31 {
    public static void main(String[] args) {
        TreeSet <String> treeSet = new TreeSet<String>();
        treeSet.add("White");
        treeSet.add("Black");
        treeSet.add("Grey");
        treeSet.add("Blue");
        treeSet.add("Red");
        System.out.println("Tree set: " + treeSet);
    }
}/*see https://www.w3resource.com/java-exercises/collection/java-collection-tree-set-exercise-1.php */

