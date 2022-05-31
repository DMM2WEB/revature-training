package com.dmm.Day04;

interface IEmployee {
    void print ();
}

class Employee implements IEmployee {
    public void display () {
        System.out.println("class display method");
    }

    @Override
    public void print () {
        System.out.println("interface print method");
    }
}

public class Demo4 {
    public static void main(String[] args) {
        //IEmployee iemployee = new IEmployee();
        Employee employee = new Employee();
        employee.display();
        employee.print();
    }
}
