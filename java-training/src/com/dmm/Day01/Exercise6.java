package com.dmm.Day01;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input 1st number: ");
        int num1 = in.nextInt();

        System.out.println("Input 2nd number: ");
        int num2 = in.nextInt();

        System.out.println("Input 3rd number: ");
        int num3 = in.nextInt();

        if (num1 > num2)
            if (num1 > num3)
                System.out.println("The greatest number: " + num1);

        if (num2 > num1)
            if (num2 > num3)
                System.out.println("The greatest number: " + num2);

        if (num3 > num1)
            if (num3 > num2)
                System.out.println("The greatest number: " + num3);
    }
}
/*see https://www.w3resource.com/java-exercises/conditional-statement/java-conditional-statement-exercise-3.php */
