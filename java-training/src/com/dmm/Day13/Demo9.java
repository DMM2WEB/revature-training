package com.dmm.Day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo9 {
    public static void main(String[] args) {
        List <Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(numbers);

        //without stream
        List<Integer> finalList = new ArrayList<>();
        for (int number : numbers) {
            int result = number * 5;
            finalList.add(result);
        }
        System.out.println(finalList);

        //with stream
        List<Integer> finalList2 = numbers
                .stream()
                .map(number -> number * 5)
                .collect(Collectors.toList());

        System.out.println(finalList2);

        List <Integer> squares = numbers
                .stream()
                .map(x -> x * x)
                .collect(Collectors.toList());

        System.out.println(squares);
    }
}
