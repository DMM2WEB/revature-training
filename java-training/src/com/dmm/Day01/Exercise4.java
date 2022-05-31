package com.dmm.Day01;

public class Exercise4 {
    public static void main(String[] args) {
        int i, j, k;

        int n = 4;

        for (i=n-1; i>0; i--) {
            for (j=n-1; j>=i; j--) {
                System.out.print(" ");
            }
            for (k=2*i-1; k>0; k--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
