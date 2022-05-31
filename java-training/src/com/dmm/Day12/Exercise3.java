package com.dmm.Day12;

//program to check if a file or directory specified by pathname exists or not

import java.io.File;

public class Exercise3 {
    public static void main(String[] args) {
        File my_file_dir = new File("db/xyx.txt");
        if (my_file_dir.exists()) {
            System.out.println("The file exists.");
        }
        else {
            System.out.println("The file does not exist.");
        }
    }
}
/*see https://www.w3resource.com/java-exercises/io/java-io-exercise-3.php */