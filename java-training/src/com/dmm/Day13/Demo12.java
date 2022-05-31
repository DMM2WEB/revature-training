package com.dmm.Day13;

interface Foo {
    void draw ();
    private void print () { //private method added by Java 9
        System.out.println("Printing...");
    }
}

class Output2 implements Foo {

    @Override
    public void draw() {
        System.out.println("Printing Output2...");
    }
}

public class Demo12 {
    public static void main(String[] args) {
        Output2 obj = new Output2();
        obj.draw();
    }
}
