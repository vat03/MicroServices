package com.aurionpro.departmentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aurionpro.departmentservice.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer>{

}
