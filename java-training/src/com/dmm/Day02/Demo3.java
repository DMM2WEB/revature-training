package com.dmm.Day02;

public class Demo3 {
    public static void main(String[] args) {
        for (int i=1; i<10; i++) {
            if (i==5) {
                System.out.println("Break");
                break; //it will stop to the rest of the statement
            }
            System.out.println(i);
        }
    }
}
