package com.dmm.Day07;

//program for chained exception

public class Exercise4 {
    public static void main(String[] args) {
        try {
            int divideByZero = 5/0;
        }
        catch (ArithmeticException ex) {
            System.out.println("Arithmetic Exception occurred: " + ex);
            try {
                throw new NumberFormatException();
            }
            catch (NumberFormatException ex2) {
                System.out.println("Chained Number Format Exception thrown manually: " + ex2);
            }
        }
    }
}/*see https://www.tutorialspoint.com/javaexamples/exception_chain.htm */
