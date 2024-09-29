package com.example.mts.tamil.school.Service;

import com.example.mts.tamil.school.exception.EmpolyNotFoundException;
import com.example.mts.tamil.school.model.Employee;
import com.example.mts.tamil.school.repos.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class EmpolyeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee getEmployee(Long id) {
        if (employeeRepository.findById(id).isPresent()) {
            return employeeRepository.findById(id).get();
        } else {
            throw new EmpolyNotFoundException("empolyee not found");
        }

    }

    public List<Employee> getAllData() {
        return employeeRepository.findAll();
    }

    public Employee updateEmpolyee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public String deleteEmployee(long id) {
        if (employeeRepository.existsById(id)) {
            employeeRepository.deleteById(id);
            return "empolyee deleted";
        } else {
            throw new RuntimeException("empolyee not found");
        }

    }
}