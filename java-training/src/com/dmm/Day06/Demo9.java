package com.dmm.Day06;

import java.util.Arrays;

public class Demo9 {
    public static void main(String[] args) {
        String message = "mark1@gmail.com";
        String [] result = message.split("@");
        System.out.println(Arrays.toString(result));
    }
}
