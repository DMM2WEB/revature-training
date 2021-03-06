package com.dmm.Day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo6 {
    public static void main(String[] args) {
        List <String> names = Arrays.asList("Mark", "Paul", "Watson", "Jeffry", "Stacy");

        List <String> result = new ArrayList<>();
        result = names
                .stream()
                .filter(name -> name.length() >4 && name.length() <8)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
