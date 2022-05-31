package com.dmm.Day12;

//program to find the longest word in a text file

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) throws FileNotFoundException {
        new Exercise8().findLongestWord ();
    }
    public String findLongestWord () throws FileNotFoundException {
        String longest_word = "";
        String current;
        Scanner sc = new Scanner(new File("db/third.txt"));

        while (sc.hasNext()) {
            current = sc.next();
            if (current.length() > longest_word.length()) {
                longest_word = current;
            }
        }
        System.out.println(longest_word);
        return longest_word;
    }
}
/*see https://www.w3resource.com/java-exercises/io/java-io-exercise-18.php */