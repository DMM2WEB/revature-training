package com.dmm;

public class Employee {
    private String name;

    public Employee() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("setter called");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }

    public void init() {
        System.out.println("init called");
    }

    public void destroy() {
        System.out.println("destroy called");
    }
}
