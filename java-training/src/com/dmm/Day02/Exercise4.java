package com.dmm.Day02;

//program to print a multiplication table of 10 in reverse order

public class Exercise4 {
    public static void main(String[] args) {
        int number = 10;
        for (int i=10; i>=1; i--) {
            System.out.println(number + " x " + i + " = " + number*i);
        }
    }
}
