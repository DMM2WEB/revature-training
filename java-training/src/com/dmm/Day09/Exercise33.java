package com.dmm.Day09;

//program to add all the elements of a specified tree set to another tree set

import java.util.TreeSet;

public class Exercise33 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("White");
        treeSet.add("Black");
        treeSet.add("Grey");
        treeSet.add("Blue");
        treeSet.add("Red");
        System.out.println("Tree set1: " + treeSet);

        TreeSet <String> treeSet2 = new TreeSet<String>();
        treeSet2.add("Yellow");
        treeSet2.add("Green");
        treeSet2.add("Brown");
        System.out.println("Tree set2: " + treeSet2);

        treeSet.addAll(treeSet2);
        System.out.println("Tree set1 + Tree set2: " + treeSet);
    }
}/*see https://www.w3resource.com/java-exercises/collection/java-collection-tree-set-exercise-3.php */
