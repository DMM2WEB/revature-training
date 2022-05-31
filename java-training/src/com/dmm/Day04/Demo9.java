package com.dmm.Day04;

interface Drawable2 {
    void draw ();
    static void area () {
        System.out.println("Getting area...");
    }
}

class Circle3 implements Drawable2 {

    @Override
    public void draw() {

    }
}

public class Demo9 {
    public static void main(String[] args) {
        Circle3 c = new Circle3();
        c.draw();
        Drawable2.area();
    }
}
