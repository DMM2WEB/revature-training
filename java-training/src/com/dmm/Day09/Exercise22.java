package com.dmm.Day09;

//program to iterate through all elements in a hash list

import java.util.HashSet;
import java.util.Iterator;

public class Exercise22 {
    public static void main(String[] args) {
        HashSet <String> h_set = new HashSet<>();
        h_set.add("White");
        h_set.add("Black");
        h_set.add("Grey");
        h_set.add("Blue");
        h_set.add("Red");

        Iterator <String> it = h_set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}/* see https://www.w3resource.com/java-exercises/collection/java-collection-hash-set-exercise-2.php */
