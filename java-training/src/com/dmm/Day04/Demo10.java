package com.dmm.Day04;

interface Drawable3 {
    void draw ();
    private void print () {
        System.out.println("printing...");
    }
}

class Output4 implements Drawable3 {

    @Override
    public void draw() {

    }
}

public class Demo10 {
    public static void main(String[] args) {
        Output4 obj = new Output4();
        obj.draw();

    }
}//to discover how to print
