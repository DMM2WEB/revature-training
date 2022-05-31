package com.dmm.Day03;

class Employee2 {
    public int empId;
    public String firstName;
    public String lastName;
    public String email;

    public void getFullName () {
        System.out.println(firstName + " " + lastName);
    }
}

class FullTimeEmployee extends Employee2 {
    public int annualSalary;
}

class PartTimeEmployee extends Employee2 {
    public int hourSalary;
}

public class Demo3 {
    public static void main(String[] args) {
        FullTimeEmployee fte = new FullTimeEmployee();
        fte.firstName = "Mark";
        fte.lastName = "Smith";

        PartTimeEmployee pte = new PartTimeEmployee();
        pte.firstName = "Paul";
        pte.lastName = "Watson";

        fte.getFullName();
        pte.getFullName();
    }
}
