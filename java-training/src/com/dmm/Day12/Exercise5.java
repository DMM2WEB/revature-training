package com.dmm.Day12;

//program to read input from java console

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input your name: ");
        String name = br.readLine();
        System.out.println("Your name is: " + name);
    }
}
/*see https://www.w3resource.com/java-exercises/io/java-io-exercise-8.php */