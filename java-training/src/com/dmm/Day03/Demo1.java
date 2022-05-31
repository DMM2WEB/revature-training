package com.dmm.Day03;

class Employee {
    public String firstName;
    public String lastName;

    public Employee () {

    }

    public Employee (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void getFullName () {
        System.out.println(firstName + " " + lastName);
    }
}

public class Demo1 {
    public static void main(String[] args) {
      /* Employee employee = new Employee();
       employee.firstName = "Mark";
       employee.lastName = "Smith";
       employee.getFullName(); // Mark Smith*/

        Employee employee = new Employee("Paul", "Watson");
        employee.getFullName();
    }
}
