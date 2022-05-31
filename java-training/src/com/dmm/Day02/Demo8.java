package com.dmm.Day02;

class Employee {
    private String firstName;
    private String lastName;

    public Employee (String firstName, String lastName) {
        System.out.println("Constructor");
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void getFullName () {
        System.out.println(firstName + " " + lastName);
    }
}

public class Demo8 {
    public static void main(String[] args) {
        Employee employee = new Employee("Paul", "Watson");
            /*employee.firstName = "Mark";
            employee.lastName = "Watson";*/
        employee.getFullName();
    }
}
