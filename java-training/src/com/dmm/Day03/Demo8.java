package com.dmm.Day03;

class Calculator {
    // dynamic or not static method
    public void addNumber (int a, int b) {
        System.out.println(a + b);
    }

    // static method
    public static void subNumber (int a, int b) {
        System.out.println( a - b);
    }
}

public class Demo8 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.addNumber( 100, 50);
        Calculator.subNumber(100, 50);
    }
}
