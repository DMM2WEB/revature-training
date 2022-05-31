package com.dmm.Day07;

/*
ArrayIndexOutOfBoundsException
Throwable -> Exception -> RuntimeException -> IndexOutBound -> ArrayIndexOutOfBoundsException
 */

public class Demo8 {
    public static void main(String[] args) {
        int [] a = new int[3];
        a [0] = 10;
        a [1] = 20;
        a [2] = 30;
        System.out.println(a[1]); //20

        try {
            System.out.println(a [10]);
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
