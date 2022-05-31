package com.dmm.Day02;

//program to calculate the sum of the numbers occurring in the multiplication table of 8

public class Exercise9 {
    public static void main(String[] args) {

        int n = 8;
        for (int i=1; i<=10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);}
        int sum = 0;
        for (int i=1; i<=10; i++) {
            sum += n*i;
        }
        System.out.println("Sum of the numbers occurring in the multiplication table of 8 is = " + sum);
    }
}
