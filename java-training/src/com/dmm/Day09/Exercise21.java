package com.dmm.Day09;

//program to append the specified element to the end of a hash set

import java.util.HashSet;

public class Exercise21 {
    public static void main(String[] args) {
        HashSet <String> h_set = new HashSet<String>();
        h_set.add("White");
        h_set.add("Black");
        h_set.add("Grey");
        System.out.println("Original hash set: " + h_set);

        h_set.add("Blue");
        System.out.println("Final hash set: " + h_set);
    }
}/*see https://www.w3resource.com/java-exercises/collection/java-collection-hash-set-exercise-1.php */
