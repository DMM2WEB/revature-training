package com.dmm.Day13;

interface Drawable {
    void draw ();

    default void print () { //default method added by Java 8
        System.out.println("Printing...");
    }
}

class Rectangle implements Drawable {

    @Override
    public void draw() {
        System.out.println("Printing Rectangle...");
    }
}

class Circle implements Drawable {

    @Override
    public void draw() {

    }

    @Override
    public void print() {
        Drawable.super.print();
        System.out.println("Printing Circle...");
    }
}

public class Demo10 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.draw();
        rectangle.print();

        Circle circle = new Circle();
        circle.draw();
        circle.print();
    }
}
