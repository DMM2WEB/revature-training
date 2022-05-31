package com.dmm.Day07;

//program with try and catch & finally block

public class Exercise1 {
    public static void main(String[] args) {
        try {
            int divideByZero = 5 / 0;
            System.out.println("Rest of code in try block");
        }
        catch (ArithmeticException ex) {
            System.out.println("ArithmeticException => " + ex.getMessage());

        }
        finally {
            System.out.println("Finally block always executes");
        }
    }
}
/*see https://www.programiz.com/java-programming/exception-handling*/