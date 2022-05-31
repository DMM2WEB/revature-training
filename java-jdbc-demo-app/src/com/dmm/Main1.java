package com.dmm;

import java.sql.*;

public class Main1 {

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
        String sql = "select * from emp_tab";
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            System.out.println("ID:" + resultSet.getInt(1) +
                                ", Name: " + resultSet.getString(2) +
                                ", E-mail: " + resultSet.getString(3));
        }

        //Step 5: finish connection
        connection.close();
    }
}
