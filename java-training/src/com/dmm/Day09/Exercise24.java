package com.dmm.Day09;

//program to empty a hash set

import java.util.HashSet;

public class Exercise24 {
    public static void main(String[] args) {
        HashSet<String> h_set = new HashSet<>();
        h_set.add("White");
        h_set.add("Black");
        h_set.add("Grey");
        h_set.add("Blue");
        h_set.add("Red");
        System.out.println("Original hash set: " + h_set);

        h_set.removeAll(h_set);
        System.out.println("Removed hash set: " + h_set);
    }
}/*see https://www.w3resource.com/java-exercises/collection/java-collection-hash-set-exercise-4.php */
