package com.dmm.Day01;

public class Demo8 {
    public static void main(String[] args) {
        int age = 20;

        String result = age > 18 ? "Eligible" : "Not Eligible";
        System.out.println(result);

        int number = 10;
        String output = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(output);
    }
}
