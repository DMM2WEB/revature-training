package com.dmm.Day02;

//program to sum first n even numbers using a while loop [Trainer uses no "while loop" but "for loop"]

public class Exercise2 {
    public static void main(String[] args) {
        int sum = 0;
        int n = 4;
        for (int i=0; i<n; i++) {
            sum = sum + (2*i);
        }
        System.out.println("Sum of first 4 even numbers is = " + sum); //0+2+4+6=12
    }
}
