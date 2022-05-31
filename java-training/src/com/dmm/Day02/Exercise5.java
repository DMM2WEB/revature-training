package com.dmm.Day02;

//program to find the factorial of a given number using for loop

/*what is a factorial number
n = n * n-1 * n-2 * n-3 ... goes on
example 5! = 5*4*3*2*1 = 120*/

public class Exercise5 {
    public static void main(String[] args) {
        int number = 5;
        int i = 1;
        int factorial = 1;
        for (i = 1; i <=number; ++i) {
            factorial *= i;
        };
        System.out.println(factorial);
    }
}/*see https://www.programiz.com/java-programming/examples/factorial */
