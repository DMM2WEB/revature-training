package com.dmm.spring.boot.api.demo.controller;

import com.dmm.spring.boot.api.demo.entity.Employee;
import com.dmm.spring.boot.api.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/employees")
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping
    public List<Employee> getAllEmployees(){
        return service.getAllEmployee();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable("id") int id){
        return service.getEmployeeById(id);
    }

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee){
        return service.addEmployee(employee);
    }

    @PutMapping("/{id}")
    public String updateEmployee(@RequestBody Employee employee, @PathVariable("id") int id){
        service.updateEmployee(employee, id);
        return "record updated successfully";
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable("id") int id) {
        service.deleteEmployee(id);
        return "record deleted successfully";
    }
}
