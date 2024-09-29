package com.example.mts.tamil.school.controller;

import com.example.mts.tamil.school.Service.EmpolyeeService;
import com.example.mts.tamil.school.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class EmployeeController {
    @Autowired
    private EmpolyeeService employeeService;
    EmployeeController(EmpolyeeService empolyeeService) {
        this.employeeService=empolyeeService;
    }
    @PostMapping("/createEmployee")
    public  String createEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
        return "success";
    }
    @GetMapping("/officeEmp/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        return  employeeService.getEmployee(id);
    }
    @GetMapping("/officeEmp")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllData();
    }
    @PutMapping("/officeEmp")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return employeeService.updateEmpolyee(employee);
    }
    @DeleteMapping("/officeEmp")
    public String deleteEmployee(@RequestBody long id) {
        return employeeService.deleteEmployee(id);
    }
}
