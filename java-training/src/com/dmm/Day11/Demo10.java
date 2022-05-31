package com.dmm.Day11;

import java.io.File;

public class Demo10 {
    public static void main(String[] args) {
        int count = 0;
        File file = new File("db");
        String [] list = file.list();
        for (String s : list) {
            File f = new File(file, s);
            if (f.isFile()) {
                System.out.println(s);
                count++;
            }
        }
        System.out.println("Total number of files: " + count);
    }
}
