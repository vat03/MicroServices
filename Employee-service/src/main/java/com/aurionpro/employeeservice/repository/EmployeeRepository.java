package com.aurionpro.employeeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aurionpro.employeeservice.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
