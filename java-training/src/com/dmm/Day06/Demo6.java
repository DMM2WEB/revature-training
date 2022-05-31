package com.dmm.Day06;

public class Demo6 {
    public static void main(String[] args) {
        String str = "Hello" + " World";
        System.out.println(str); //HelloWorld

        //it sees int, then String, then again String for sequence
        String str2 = 10 + 20 + 30 + "Sum" + 40 + 50 + true;
        System.out.println(str2);
    }
}
