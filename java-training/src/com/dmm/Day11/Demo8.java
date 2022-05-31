package com.dmm.Day11;

import java.io.File;
import java.io.IOException;

public class Demo8 {
    public static void main(String[] args) {
        File dir = new File("db");
        dir.mkdir();

        File file = new File("db", "first.txt");
        File file2 = new File("db", "second.txt");
        File file3 = new File("db", "third.txt");
        try {
            file.createNewFile();
            file2.createNewFile();
            file3.createNewFile();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(file.exists());
    }
}
