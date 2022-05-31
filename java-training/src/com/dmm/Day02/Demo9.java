package com.dmm.Day02;

class Calculation {
    int a = 20;
    int b = 10;

    public Calculation () {
        System.out.println("Parameter less constructor");
    }

    public Calculation (int x, int y) {
        System.out.println("Parameterized constructor");
        this.a = x;
        this.b = y;
    }

    public void addNumber () {
        System.out.println("Sum=" + (a + b));
    }
}

public class Demo9 {
    public static void main(String[] args) {
        Calculation calculation1 = new Calculation();
        calculation1.addNumber();

        Calculation calculation2 = new Calculation(200, 100);
        calculation2.addNumber();
    }
}
