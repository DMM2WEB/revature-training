package com.dmm.Day06;

public class Demo5 {
    public static void main(String[] args) {

        /*
        compareTo () method returns a positive number, negative number or 0
        if s1 > s2 returns positive number
        if s1 < s2 returns negative number
        if s1 == s2 returns 0
         */

        String s1 = "Mark";
        String s2 = "Mark";
        String s3 = "Paul";

        System.out.println(s1.compareTo(s2)); //0 because both are equal
        System.out.println(s1.compareTo(s3)); //-3 because m is three times lower than p
        System.out.println(s3.compareTo(s1)); //+3 because p is three times greater than m
    }
}
