package com.dmm.Day11;

import java.io.File;

public class Demo11 {
    public static void main(String[] args) {
        File file = new File("db", "second.txt");
        System.out.println(file.exists());
        file.delete();
        System.out.println(file.exists());
    }
}
