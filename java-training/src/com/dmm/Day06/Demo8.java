package com.dmm.Day06;

public class Demo8 {
    public static void main(String[] args) {
        String message = "Welcome to java training";
        System.out.println(message.substring(0,7)); //Welcome

        System.out.println("Original message: " + message); //
        System.out.println("Substring starting from index 7: " + message.substring(7)); //to java training
        System.out.println("Substring starting from 0 to 7: " + message.substring(0,7)); //Welcome

        String str = new String("Welcome home");
        System.out.println(str);
        System.out.println(str.substring(8)); //home
    }
}
