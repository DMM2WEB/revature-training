package com.dmm.Day06;

public class Demo14 {
    public static void main(String[] args) {
        System.out.println("Performance Test");

        long startTime = System.currentTimeMillis();

        StringBuffer stringBuffer = new StringBuffer("Hello");
        startTime = System.currentTimeMillis();
        for (int i=0; i<1000000; i++) {
            stringBuffer.append("World");
        }
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime + "ms")); //Fast
        System.out.println("*********");


        StringBuilder stringBuilder = new StringBuilder("Hello");
        startTime = System.currentTimeMillis();
        for (int i=0; i<1000000; i++) {
            stringBuilder.append("World");
        }
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime + "ms")); //Faster
    }
}
