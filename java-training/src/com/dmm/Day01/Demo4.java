package com.dmm.Day01;

public class Demo4 {
    public static void main(String[] args) {
        int a = 40;
        int b = 20;

        int addition = a + b; //60
        int subtract = a - b; //20
        int multiply = a * b; //800
        int divide = a / b; //2

        System.out.println(addition);
        System.out.println(subtract);
        System.out.println(multiply);
        System.out.println(divide);

        String str1 = "10";
        String str2 = "20";
        String result = str1 + str2;
        System.out.println(result); //1020

        int t = 10;
        int u = 20;
        String x = "Hello";
        int y = 10;
        int z = 20;

        System.out.println(t + u + x + y + z); //check the output 30Hello1020

        System.out.println(t + u + x + (y + z)); //and check the other output 30Hello30

    }
}
