package com.dmm.Day01;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        int j, n;
        System.out.print("Input the number (table to be calculated): (equals to) "); {
            System.out.print("Input number of terms: ");
            Scanner in = new Scanner(System.in);
            n = in.nextInt();

            for (j = 0; j <= n; j++)
            System.out.println(n + "x " + j + "= " + n * j);
        }
    }
}
/*see https://www.w3resource.com/java-exercises/conditional-statement/java-conditional-statement-exercise-14.php */
