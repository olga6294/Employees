package com.example.employees.employee.dao;

import com.example.employees.employee.dto.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query("SELECT id, name FROM Employee WHERE salary IS NOT NULL AND dateOfEmployment IS NOT NULL")
    List<Employee> findAllActive();

    @Query("UPDATE Employee SET name = :name WHERE id = :id")
    void update(@Param("id") Long id, @Param("name") String employeeName);
}
