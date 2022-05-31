package com.dmm;

import java.sql.*;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //Step 1: load driver
        /* Class.forName("jdbc:mysql://localhost");*/

        //Step 2: create connection object
        String url = "jdbc:mysql://localhost:3306/revature";
        String userName = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, userName, password);

        //Step 3: create statement object
        Statement statement = connection.createStatement();

        //Step 4: execute query
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = scanner.next();
        System.out.println("Enter email: ");
        String email = scanner.next();

        String sql = "Insert into emp_tab (name, email) values ( '" + name + "', '" + email + "' )";
        System.out.println(sql);
        int rows = statement.executeUpdate(sql);

        System.out.println("( " + rows + ") rows affected");

        //Step 5: finish connection
        connection.close();
    }
}
