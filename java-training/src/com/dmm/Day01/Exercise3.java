package com.dmm.Day01;

public class Exercise3 {
    public static void main(String[] args) {
        int i, j, k;

        int n = 4;

        for (i=0; i<n; i++) {
            for (j=0; j<n-i-1; j++) {
                System.out.print(" ");
            }
            for (k=0; k<2*i+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
