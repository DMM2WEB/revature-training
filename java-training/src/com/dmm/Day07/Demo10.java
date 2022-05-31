package com.dmm.Day07;

/*
StackOverflowError
 */

public class Demo10 {
    public static void main(String[] args) {
        //print1();

        try {
            print1();
        }
        catch (StackOverflowError ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void print1() {
        print2();
    }

    public static void print2() {
        print1();
    }
}
