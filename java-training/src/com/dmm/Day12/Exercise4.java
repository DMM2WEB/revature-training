package com.dmm.Day12;

//program to check if given pathname is a directory or a file

import java.io.File;

public class Exercise4 {
    public static void main(String[] args) {
        File my_file_dir = new File("db/third.txt");
        if (my_file_dir.isDirectory()) {
            System.out.println(my_file_dir.getAbsolutePath() + " is a directory.");
        } else {
            System.out.println(my_file_dir.getAbsolutePath() + " is not a directory.");
        }
        if (my_file_dir.isFile()) {
            System.out.println(my_file_dir.getAbsolutePath() + " is a file.");
        } else {
            System.out.println(my_file_dir.getAbsolutePath() + " is not a file.");
        }
    }
}
/*see https://www.w3resource.com/java-exercises/io/java-io-exercise-5.php */