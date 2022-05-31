package com.dmm.Day06;

public class Demo3 {
    public static void main(String[] args) {

        /*equal() method compares the two given String based on the content of string
        if any character is not matched, it returns false
        if any character is matched, it returns true*/

        String s1 = "Mark";
        String s2 = "Mark";
        String s3 = new String("Mark");
        String s4 = "Paul";

        System.out.println(s1.equals(s2)); //true
        System.out.println(s1.equals(s3)); //true
        System.out.println(s1.equals(s4)); //false

        String s5 = "MARK";
        System.out.println(s1.equals(s5)); //false
        System.out.println(s1.equalsIgnoreCase(s5)); //true
    }
}
