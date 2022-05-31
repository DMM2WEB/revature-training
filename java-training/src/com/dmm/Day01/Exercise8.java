package com.dmm.Day01;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        int i, j, n;
        System.out.print("Input number of rows: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        for (i=1; i<=n; i++) {
            for (j=1; j<=i; j++)
            System.out.print(j);

            System.out.println("");
        }
    }
}
/*see https://www.w3resource.com/java-exercises/conditional-statement/java-conditional-statement-exercise-16.php */
