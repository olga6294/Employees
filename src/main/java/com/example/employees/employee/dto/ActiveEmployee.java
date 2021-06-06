package com.example.employees.employee.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ActiveEmployee extends Employee {

    private Double salary;
    private Date dateOfEmployment;

}
