package com.dmm.Day12;

class Calculator <T> {
    /*public boolean areEqual (int a, int b) {
        if (a==b)
            return true;
        else
            return false;
    }*/

   /* public boolean areEqual (Object a, Object b) {
        if (a.equals(b))
            return true;
        else
            return false;
    }*/

    public boolean areEqual (T a, T b) {
        if (a.equals(b))
            return true;
        else
            return false;
    }
}

public class Demo5 {
    public static void main(String[] args) {
        /*Calculator calculator = new Calculator();
        boolean result = calculator.areEqual(10, 20);*/

        Calculator<String> calculator = new Calculator<> ();
        boolean result = calculator.areEqual("A", "100");

        if (result) {
            System.out.println("Items are equal");
        }
        else {
            System.out.println("Items are not equal");
        }
    }
}
