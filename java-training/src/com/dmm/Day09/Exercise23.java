package com.dmm.Day09;

//program to get the number of elements in a hash set

import java.util.HashSet;

public class Exercise23 {
    public static void main(String[] args) {
        HashSet<String> h_set = new HashSet<>();
        h_set.add("White");
        h_set.add("Black");
        h_set.add("Grey");
        h_set.add("Blue");
        h_set.add("Red");
        System.out.println("Original hash set: " + h_set);
        System.out.println("Size of the hash set: " + h_set.size());
    }
}
/*see https://www.w3resource.com/java-exercises/collection/java-collection-hash-set-exercise-3.php */