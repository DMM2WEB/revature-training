package com.dmm.Day04;

abstract class Calculator {

    //regular or non abstract method
    public void addNumber(int num1, int num2) {
        System.out.println("Sum: " + (num1 + num2));
    }

    public void subNumber(int num1, int num2) {
        System.out.println("Subtraction: " + (num1 - num2));
    }

    //abstract method
    public abstract void mulNumber(int num1, int num2);

    public abstract void divNumber(int num1, int num2);
}

class Output extends Calculator {

    @Override
    public void mulNumber(int num1, int num2) {
        System.out.println("Multiplication: " + (num1 * num2));
    }

    @Override
    public void divNumber(int num1, int num2) {
        System.out.println("Division: " + (num1 / num2));
    }

}

public class Demo1 {
    public static void main(String[] args) {
        Output output = new Output();
        output.addNumber (200, 100);
        output.subNumber (200, 100);
        output.mulNumber (200, 100);
        output.divNumber (200, 100);
    }
}
