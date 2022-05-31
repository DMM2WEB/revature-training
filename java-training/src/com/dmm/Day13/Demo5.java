package com.dmm.Day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo5 {
    public static void main(String[] args) {
       /* ArrayList <Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);*/

        List <Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);
        System.out.println(numbers);
        List<Integer> evenNumber = new ArrayList<>();

        //without using stream
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumber.add(number);
            }
        }
        System.out.println(evenNumber);

        //with using stream
        evenNumber = numbers.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumber);
    }
}
