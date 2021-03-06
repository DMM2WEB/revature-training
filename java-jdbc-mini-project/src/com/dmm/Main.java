package com.dmm;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        //Employee Dao
        EmployeeDao dao = EmployeeDaoFactory.getEmployeeDao();

        /*Employee employee = new Employee();
        employee.setName("Mark");
        employee.setEmail("m@mail.com");

        dao.addEmployee(employee);*/

        Scanner scanner = new Scanner(System.in);

        boolean flag = true;

        while (flag) {
            System.out.println("*********");
            System.out.println("Select from the options below: ");
            System.out.println("*********");
            System.out.println("PRESS 1: Add Employee");
            System.out.println("PRESS 2: Update Employee");
            System.out.println("PRESS 3: Delete Employee");
            System.out.println("PRESS 4: Get All Employee");
            System.out.println("PRESS 5: Get Employee By ID");
            System.out.println("PRESS 6: Exit");
            System.out.println("*********");

            int input = scanner.nextInt();
            switch (input) {
                case 1: { //add
                    System.out.println("Enter Name: ");
                    String name = scanner.next();
                    System.out.println("Enter Email: ");
                    String email = scanner.next();
                    Employee newEmployee = new Employee();
                    newEmployee.setName(name);
                    newEmployee.setEmail(email);
                    dao.addEmployee(newEmployee);
                    break;
                }
                case 2: { //update
                    System.out.println("Enter ID: ");
                    int id = scanner.nextInt();
                    System.out.println("Enter Name: ");
                    String name = scanner.next();
                    System.out.println("Enter Email: ");
                    String email = scanner.next();
                    Employee employee = new Employee(id, name, email);
                    dao.updateEmployee(employee);
                    break;
                }
                case 3: { //delete
                    System.out.println("Enter ID: ");
                    int id = scanner.nextInt();
                    dao.deleteEmployee(id);
                    break;
                }
                case 4: { //get all
                    List<Employee> employees = dao.getEmployees();
                    for (Employee employee : employees) {
                        System.out.println(employee);
                    }
                    break;
                }
                case 5: { //get employee by id
                    System.out.println("Enter ID: ");
                    int id = scanner.nextInt();
                    Employee employee = dao.getEmployeeById(id);
                    System.out.println(employee);
                    break;
                }
                case 6: { //exit
                    System.out.println("Thank you!");
                    System.out.println("Exiting...");
                    flag = false;
                    break;
                }
                default:
                    System.out.println("Choose between 1-6");
            }
        }
    }
}