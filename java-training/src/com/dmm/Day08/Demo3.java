package com.dmm.Day08;

import java.util.ArrayList;
import java.util.Collections;

public class Demo3 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Yellow");
        colors.add("Red");
        colors.add("Orange");
        colors.add("Pink");

        //before sorting
        System.out.println("Before sorting...");
        for (String color : colors) {
            System.out.println(color);
        }

        //after sorting
        System.out.println();
        System.out.println("After sorting...");
        Collections.sort(colors);
        //Collections.reverse(colors); //to sort in reverse way
        for (String color : colors) {
            System.out.println(color);
        }

        System.out.println();

        //list of numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(7);
        numbers.add(1);
        numbers.add(5);
        numbers.add(4);
        numbers.add(3);

        //before sorting
        System.out.println("Before sorting...");
        for (Integer number : numbers) {
            System.out.println(number);
        }

        //after sorting
        System.out.println();
        System.out.println("After sorting...");
        Collections.sort(numbers);
        //Collections.reverse(numbers); //to sort in reverse way
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
