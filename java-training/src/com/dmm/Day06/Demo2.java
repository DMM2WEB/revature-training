package com.dmm.Day06;

public class Demo2 {
    public static void main(String[] args) {
        String str = "Hello";
        str.concat("World"); //using concat() method to append the String at the end
        System.out.println(str); //it will print Hello only because Strings are immutable objects

        String str1 = "Hello";
        str1 = str1.concat(" World");
        System.out.println(str1); //HelloWorld
    }
}
