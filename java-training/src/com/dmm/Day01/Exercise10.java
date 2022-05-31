package com.dmm.Day01;

public class Exercise10 {
    public static void main(String[] args) {
        int i, j, k;

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows for full diamond ");
        int n = scanner.nextInt();*/

        int n = 7;

        for (i=0; i<n; i++) {
            for (j=0; j<n-i-1; j++) {
                System.out.print(" ");
            }
            for (k=0; k<2*i+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

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
