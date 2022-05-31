package com.dmm.Day06;

public class Demo12 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity()); //16

        sb.append("Hello");
        System.out.println(sb.capacity()); //16

        sb.append("Welcome to java class");
        System.out.println(sb.capacity()); //34
    }
}
