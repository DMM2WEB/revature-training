package com.dmm.Day13;

interface Drawable2 {
    void draw ();
    static void print () { //static method added by Java 8
        System.out.println("Printing...");
    }
}

class Circle2 implements Drawable2 {

    @Override
    public void draw() {
        System.out.println("Printing Circle...");
    }
}

public class Demo11 {
    public static void main(String[] args) {
        Circle2 obj = new Circle2();
        obj.draw();
        Drawable2.print();
    }
}
