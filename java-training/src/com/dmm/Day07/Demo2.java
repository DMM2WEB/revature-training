package com.dmm.Day07;

public class Demo2 {
    public static void main(String[] args) {
        int a = 20;
        int b = 0;
        int c = 0;

        try {
            c = a / b;
        }

        catch (ArithmeticException ex) {
            System.out.println("Invalid number");
        }

        catch (Exception ex) {
            System.out.println("Exception occurs");
        }
    }
}
