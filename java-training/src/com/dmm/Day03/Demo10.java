package com.dmm.Day03;

class Customer {
    public int custId;
    public String customerName;
    public static String companyName = "Revature";

    public Customer (int custId, String customerName) {
        this.custId = custId;
        this.customerName = customerName;
    }

    public void printInfo () {
        System.out.println("Identity: " + custId + ", Customer name: " + customerName + ", Company name: " + companyName);
    }
}

public class Demo10 {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "Mark") ;
        Customer customer1 = new Customer(2, "Paul");

        customer.printInfo();
        customer1.printInfo();
    }
}
