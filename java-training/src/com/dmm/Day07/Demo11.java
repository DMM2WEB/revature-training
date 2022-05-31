package com.dmm.Day07;

public class Demo11 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        try {
            c = a / b;
            System.out.println(a/b);
        }
        catch (ArithmeticException ex) {
            System.out.println(ex.getMessage() + "ArithmeticException");

        }
        catch (NullPointerException | NumberFormatException e) {
            System.out.println(e.getMessage() + "NullPointerException | NumberFormatException");

        }
        catch (Exception ex) {
            System.out.println(ex.getMessage() + "Exception");

        }
    }
}
