package com.example.employees.employee.controller;

import com.example.employees.employee.dto.Employee;
import com.example.employees.employee.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping("/create")
    public void create(@RequestBody Employee employee) {
        employeeService.create(employee);
    }

    @GetMapping("/get")
    public List<Employee> getAll(@RequestParam(defaultValue = "false") boolean active) {
        return employeeService.getAll(active);
    }

    @PutMapping("/update/{id}")
    public void update(@RequestParam Long id, @RequestBody Employee employee) {
        employeeService.update(id, employee);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@RequestParam Long id) {
        employeeService.delete(id);
    }
}
