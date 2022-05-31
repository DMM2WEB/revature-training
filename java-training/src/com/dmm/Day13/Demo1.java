package com.dmm.Day13;

@FunctionalInterface
interface DrawSomeThing {
    void draw ();
}

class Output implements DrawSomeThing {
    @Override
    public void draw () {
        System.out.println("Drawing...");
    }
}

public class Demo1 {
    public static void main(String[] args) {
        //without lambda expression
        Output output = new Output();
        output.draw();

        DrawSomeThing d2 = new DrawSomeThing() {
            @Override
            public void draw() {
                System.out.println("Drawing2...");
            }
        };
        d2.draw();

        //with lambda expression
        DrawSomeThing d3 = () -> {
            System.out.println("Drawing with lambda...");
        };
        d3.draw();
    }
}
