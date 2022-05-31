package com.dmm.Day07;

/*
NullPointerException
<p>
Throwable -> Exception -> RuntimeException -> NullPointerException
 */

class Customer {
    public void display () {
        System.out.println("Displaying...");
    }
}

public class Demo9 {
    public static void main(String[] args) {
        String str = "Mark";
        System.out.println(str.length()); //4

        String str2 = null;
        try {
            System.out.println(str2.length());
        }
        catch (NullPointerException ex) { //exception
            System.out.println(ex.getMessage());
        }

       /* Customer customer = new Customer();
        customer.display();*/

        Customer customer = null;
        //customer.display();

        try {
            customer.display();
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
