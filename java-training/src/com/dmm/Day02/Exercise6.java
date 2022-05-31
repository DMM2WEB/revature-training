package com.dmm.Day02;

//program to find the factorial of a given number using while loop

/*what is a factorial number
n = n * n-1 * n-2 * n-3 ... goes on
example 5! = 5*4*3*2*1 = 120*/

public class Exercise6 {
    public static void main(String[] args) {
        int number = 5;
        int i = 1;
        int factorial = 1;
        while (i <= number) {
            factorial *= i;
            i++;
        }
        System.out.println(factorial);
    }
}
