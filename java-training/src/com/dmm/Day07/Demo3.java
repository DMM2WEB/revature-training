package com.dmm.Day07;

class EmployeeException extends Exception {

}

public class Demo3 {
    public static void main(String[] args) throws EmployeeException {
        /*ArithmeticException exception = new ArithmeticException();
        throw exception;*/

        /*EmployeeException ex = new EmployeeException();
        try {
            throw ex;
        } catch (EmployeeException e) {
            e.printStackTrace();
        }*/

        throw new EmployeeException();
    }
}
