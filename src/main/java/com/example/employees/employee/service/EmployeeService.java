package com.example.employees.employee.service;

import com.example.employees.employee.dao.EmployeeRepository;
import com.example.employees.employee.dto.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public void create(Employee employee) {
        employeeRepository.save(employee);
    }

    public List<Employee> getAll(boolean active) {
        if (active) {
            return employeeRepository.findAll();
        }
        return employeeRepository.findAllActive();
    }

    public void update(Long id, Employee employee) {
        employeeRepository.update(id, employee.getName());
    }

    public void delete(Long id) {
        employeeRepository.deleteById(id);
    }

}
