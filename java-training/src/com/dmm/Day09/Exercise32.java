package com.dmm.Day09;

//program to iterate through all elements in a tree set

import java.util.Iterator;
import java.util.TreeSet;

public class Exercise32 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("White");
        treeSet.add("Black");
        treeSet.add("Grey");
        treeSet.add("Blue");
        treeSet.add("Red");

        Iterator <String> it = treeSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}/*see https://www.w3resource.com/java-exercises/collection/java-collection-tree-set-exercise-2.php */
