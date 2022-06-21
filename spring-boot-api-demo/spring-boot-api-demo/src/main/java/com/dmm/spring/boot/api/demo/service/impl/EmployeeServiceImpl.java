package com.dmm.spring.boot.api.demo.service.impl;

import com.dmm.spring.boot.api.demo.entity.Employee;
import com.dmm.spring.boot.api.demo.repository.EmployeeRepository;
import com.dmm.spring.boot.api.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    @Override
    public List<Employee> getAllEmployee() {
        return repository.findAll();
    }

    @Override
    public Employee getEmployeeById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public void updateEmployee(Employee employee, int id) {
        Employee employeeDb = repository.findById(id).get();
        employeeDb.setName(employee.getName());
        employeeDb.setEmail(employee.getEmail());
        repository.save(employeeDb);
    }

    @Override
    public void deleteEmployee(int id) {
        repository.deleteById(id);
    }
}
