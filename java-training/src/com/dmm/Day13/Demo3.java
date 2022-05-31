package com.dmm.Day13;

import java.util.ArrayList;
import java.util.List;

public class Demo3 {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        list.add("John");
        list.add("Paul");
        list.add("Watson");

        list.forEach(
                (name) -> System.out.println(name)
        );
    }
}
