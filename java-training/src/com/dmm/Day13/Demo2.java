package com.dmm.Day13;

interface ISayHello {
    String hello ();
}

interface ISayHello2 {
    String hello (String name);
}

interface ICalculator {
    int addNumber (int a, int b);
}

public class Demo2 {
    public static void main(String[] args) {
        ISayHello s1 = () -> {
            return "Hello World";
        };
        String result = s1.hello();
        System.out.println(result);

        ISayHello2 s2 = (name) -> {
            return "Welcome " + name;
        };
        System.out.println(s2.hello("Mark"));

        ICalculator calculator = (x, y) -> {
            return x + y;
        };
        System.out.println(calculator.addNumber(100, 200));
    }
}
