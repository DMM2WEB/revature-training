package com.dmm.Day13;

interface IDisplay {
    String message (String str);
}

public class Demo4 {
    public static void main(String[] args) {
        IDisplay display = (name) -> {
            String str1 = "Hello ";
            String str2 = name;
            String str3 = ", how are you?";
            return str1 + str2 + str3;
        };
        System.out.println(display.message("Paul"));
    }
}
