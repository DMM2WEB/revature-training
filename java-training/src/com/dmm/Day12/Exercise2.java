package com.dmm.Day12;

//program to get specific files by extensions from a specified folder

import java.io.File;
import java.io.FilenameFilter;

public class Exercise2 {
    public static void main(String[] args) {
        File file = new File("db");
        String [] list = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (name.toLowerCase().endsWith(".txt")) {
                    return true;
                }
                else {
                    return false;
                }
            }
        });
        for (String f: list) {
            System.out.println(f);
        }
    }
}
/*see https://www.w3resource.com/java-exercises/io/java-io-exercise-2.php */