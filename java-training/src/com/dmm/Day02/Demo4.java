package com.dmm.Day02;

public class Demo4 {
    public static void main(String[] args) {
        for (int i=1; i<10; i++) {
            if (i==5) {
                continue; //it will skip to the rest of the statement
            }
            System.out.println(i);
        }
    }
}
