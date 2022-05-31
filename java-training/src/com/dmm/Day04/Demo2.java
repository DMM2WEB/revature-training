package com.dmm.Day04;

abstract class Shape {
    public double width;
    public double height;
    public double radius;
    public final float pie = 3.14f;

    public abstract void getArea ();
}

class Rectangle extends Shape {
    public Rectangle (double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void draw () {
        System.out.println("Rectangle drawing...");
    }

    @Override
    public void getArea () {
        System.out.println("Area: " + (width * height));
    }
}

class Circle extends Shape {
    public Circle(double radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Circle drawing...");
    }

    @Override
    public void getArea() {
        System.out.println("Area: " + (pie * radius * radius));
    }
}

public class Demo2 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(12.34, 56.78);
        Circle circle = new Circle(55.55);

        rectangle.draw();
        circle.draw();

        rectangle.getArea();
        circle.getArea();
    }
}
