package com.dmm.Day01;

public class Demo6 {
    public static void main(String [] args) {
        int age = 15;

        if(age > 18) {
            System.out.println("Eligible"); }
        else {
            System.out.println("Not Eligible");
        }

        if(age < 18)
            System.out.println("Not Eligible");
        else
            System.out.println("Eligible");
    }
}
