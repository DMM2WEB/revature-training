package com.dmm;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {
    Connection connection;

    public EmployeeDaoImpl () {
        this.connection = ConnectionFactory.getConnection ();
    }

    @Override
    public void addEmployee (Employee employee) throws SQLException {
        String sql = "INSERT INTO employee (name, email) values (?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, employee.getName());
        preparedStatement.setString(2, employee.getEmail());
        int count = preparedStatement.executeUpdate();
        if (count > 0)
            System.out.println("Employee saved");
        else
            System.out.println("Oops! Something went wrong...");
    }

    @Override
    public void updateEmployee (Employee employee) throws SQLException {
        String sql = "UPDATE employee set name = ?, email = ? where id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, employee.getName());
        preparedStatement.setString(2, employee.getEmail());
        preparedStatement.setInt(3, employee.getId());
        int count = preparedStatement.executeUpdate();
        if (count > 0)
            System.out.println("Employee updated");
        else
            System.out.println("Oops! Something went wrong...");
    }

    @Override
    public void deleteEmployee (int id) throws SQLException {
        String sql = "DELETE from employee WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        int count = preparedStatement.executeUpdate();
        if (count > 0)
            System.out.println("Employee deleted");
        else
            System.out.println("Oops! Something went wrong...");
    }

    @Override
    public List<Employee> getEmployees () throws SQLException {
        //return null;
        List<Employee> employees = new ArrayList<>();
        String sql = "SELECT * FROM employee";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String email = resultSet.getString(3);
            Employee employee = new Employee(id, name, email);
            employees.add(employee);
        }
        return employees;
    }

    @Override
    public Employee getEmployeeById (int empId) throws SQLException {
        //return null;
        Employee employee = new Employee();
        String sql = "SELECT * FROM employee WHERE id = " + empId;
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        // if (resultSet!=null) {
        if (resultSet.next()) { //'.next()' added later
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String email = resultSet.getString(3);
            employee = new Employee(id, name, email);
        }
        else {
            System.out.println("No record found");
        }
        return employee;
    }
}
