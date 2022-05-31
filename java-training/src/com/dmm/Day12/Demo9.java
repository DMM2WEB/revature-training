package com.dmm.Day12;

import java.util.ArrayList;
import java.util.List;

abstract class Shape {
    abstract void draw ();
}

class Rectangle extends Shape {
    @Override
    void draw () {
        System.out.println("Drawing rectangle...");
    }
}

class Circle extends Shape {
    @Override
    void draw () {
        System.out.println("Drawing circle...");
    }
}

class Cone {
    void draw () {
        System.out.println("Drawing cone...");
    }
}

class Output {
    //creating a method that accept only child class of class Shape
    public static void drawShape (List<? extends Shape> list) {
        for (Shape shape : list) {
            shape.draw(); //calling method of class Shape by child class instance
        }
        System.out.println("Message");
    }
}

public class Demo9 {
    public static void main(String[] args) {
        List<Rectangle> rectangleList = new ArrayList<>();
        List<Circle> circleList = new ArrayList<>();
        List<Cone> coneList = new ArrayList<>();

        Output output = new Output();
        output.drawShape(rectangleList);
        output.drawShape(circleList);
        //output.drawShape(coneList);

        System.out.println(rectangleList);
        System.out.println(circleList);
        System.out.println(coneList);
    }
}
