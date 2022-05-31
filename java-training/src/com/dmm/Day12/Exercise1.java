package com.dmm.Day12;

//program to get a list of all file/directory names from the given

import java.io.File;

public class Exercise1 {
    public static void main(String[] args) {
        File file = new File("db");
        String [] fileList = file.list ();
        for (String name : fileList) {
            System.out.println(name);
        }
    }
}
/*see https://www.w3resource.com/java-exercises/io/java-io-exercise-1.php */