package com.dmm.Day12;

class Employee2 {
    String name;

    public <T> Employee2 (T name) {
        this.name = name.toString();
    }
}

public class Demo8 {
    public static void main(String[] args) {
        Employee2 emp21 = new Employee2("Mark");
        Employee2 emp22 = new Employee2(123);

        System.out.println(emp21.name);
        System.out.println(emp22.name);
    }
}
