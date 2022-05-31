package com.dmm.Day12;

import java.util.ArrayList;
import java.util.Collections;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<String> letters = new ArrayList<>();
        letters.add("B");
        letters.add("A");
        letters.add("D");
        letters.add("C");
        letters.add("F");
        letters.add("E");

        System.out.println("Before sorting...");
        for (String letter : letters) {
            System.out.println(letter);
        }

        System.out.println("*********");

        Collections.sort(letters);
        System.out.println("After sorting...");
        for (String letter : letters) {
            System.out.println(letter);
        }
    }
}
