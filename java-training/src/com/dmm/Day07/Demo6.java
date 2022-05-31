package com.dmm.Day07;

public class Demo6 {
    public static void main(String[] args) {

        //case 1: exception not occur
        try {
            int c = 10 / 5;
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("Case1: final called");
        }

        //case 2: exception occurs but not handled
        /*try {
            int c = 10 / 0;
        }
        finally {
            System.out.println("Case 2 final called");
        }*/

        //case 3: exception occurs but handled
        try {
            int c = 10 / 0;
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("Case 3: final called");
        }
    }
}
