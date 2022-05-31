package com.dmm.Day12;

//program to read first 3 lines from a file

import java.io.*;

public class Exercise7 {
    public static void main(String[] args) {
        BufferedReader br = null;
        String strLine = "";
        try {
            LineNumberReader reader = new LineNumberReader(new InputStreamReader(new FileInputStream("db/third.txt")));
            while (((strLine = reader.readLine()) !=null) && reader.getLineNumber() <=3) {
                System.out.println(strLine);
            }
            reader.close();
        }
        catch (FileNotFoundException e) {
            System.err.println("File not found");
        }
        catch (IOException e) {
            System.err.println("Unable to read file");
        }
    }
}
/*see https://www.w3resource.com/java-exercises/io/java-io-exercise-17.php */