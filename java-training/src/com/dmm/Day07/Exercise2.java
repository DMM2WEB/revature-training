package com.dmm.Day07;

//program for multiple catch with single try

public class Exercise2 {
    public static void main(String[] args) {
        try {
            int divideByZero = 5 / 0;
        }
        catch (ArithmeticException ex) {
            System.out.println("Arithmetic Exception");
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Array Index Out Of Bounds Exception");
        }
        catch (Exception ex) {
            System.out.println("Parent Exception");
        }
        System.out.println("Rest of the code");
    }
}/*see https://www.javatpoint.com/multiple-catch-block-in-java*/
