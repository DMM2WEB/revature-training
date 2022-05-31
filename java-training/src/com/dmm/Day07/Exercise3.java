package com.dmm.Day07;

//program illustrating throws keyword

public class Exercise3 {
    public static void main(String[] args) {
        try {
            doAnything();
            System.out.println("Do Anything");
        }
        catch (Exception ex) {
            System.out.println("Exception");
        }
    }

    public static void doAnything () throws Exception {
        doAnythingElse();
        System.out.println("Do Anything Else");
    }

    public static void doAnythingElse () throws Exception {
        doAnythingAnythingElse();
        System.out.println("Do Anything Anything Else");
    }
    public static void doAnythingAnythingElse () throws Exception {
        throw new Exception ();
    }
}
//based on Demo12