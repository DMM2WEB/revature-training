package com.dmm.Day11;

import java.io.FileWriter;
import java.io.IOException;

public class Demo12 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("data2.txt");
        fw.write(100);
        fw.write("\n");
        fw.write("This is some message");
        fw.write("\n");
        char[] c1 = {'h', 'e', 'l', 'l', 'o'};
        fw.write(c1);
        fw.write("\n");

        fw.flush();
        fw.close();

        System.out.println("File data2.txt created - read it");
    }
}
