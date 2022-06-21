package com.dmm.spring.boot.api.demo.service;

import com.dmm.spring.boot.api.demo.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    public List<Employee> getAllEmployee();
    public Employee getEmployeeById(int id);
    public Employee addEmployee(Employee employee);
    public void updateEmployee(Employee employee, int id);
    public void deleteEmployee(int id);
}
