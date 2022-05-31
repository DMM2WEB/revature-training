package com.dmm.Day12;

//program to read a file content line by line

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exercise6 {
    public static void main(String[] args) {
        BufferedReader br = null;
        String strLine = "";
        try {
            br = new BufferedReader(new FileReader("db/third.txt"));
            while ((strLine = br.readLine()) !=null) {
                System.out.println(strLine);
            }
            br.close();
        }
        catch (FileNotFoundException e) {
            System.err.println("File not found");
        }
        catch (IOException e) {
            System.err.println("Unable to read the file");
        }
    }
}
/*see https://www.w3resource.com/java-exercises/io/java-io-exercise-11.php */