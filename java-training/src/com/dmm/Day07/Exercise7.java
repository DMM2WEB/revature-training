package com.dmm.Day07;

//program to prevent creation of second object

class NotMoreException extends Exception {
    NotMoreException () {
        super("No more than the first object");
    }
}

class Test {
    static int a = 0;
    Test () throws NotMoreException {
        if (a == 0) {
            a++;
        }
        else throw new NotMoreException();
    }
}

public class Exercise7 {
    public static void main(String[] args) {
        try {
            Test t1 = new Test();
            Test t2 = new Test();
            Test t3 = new Test();
        }
        catch (NotMoreException ex) {
            System.out.println(ex);
        }
    }
}/* see https://www.tutorialride.com/java-exception-handling-programs/prevent-second-object-creation-with-exception-handling.htm */
