package com.dmm.Day04;

interface Drawable {
    void draw ();

    default void print () {
        System.out.println("print...");
    }
}

class Rectangle2 implements Drawable {

    @Override
    public void draw() {

    }
}

class Circle2 implements Drawable {

    @Override
    public void draw() {

    }
}

public class Demo8 {
    public static void main(String[] args) {
        System.out.println("Demo8");
    }
}
