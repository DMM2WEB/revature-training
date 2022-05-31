package com.dmm.Day03;

public class Demo13 {
    public static void main(String[] args) {

        String message = "Hello World!";
        message.indexOf('o'); // 4
        message.indexOf('o', 5); // 7
        message.indexOf("ll"); // 2

        System.out.println(message.indexOf('o'));
        System.out.println(message.indexOf('o', 5));
        System.out.println(message.indexOf("ll"));
    }
}
