package com.aurionpro.departmentservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aurionpro.departmentservice.entity.Department;
import com.aurionpro.departmentservice.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public Department getDepartment(int deptId) {
		Department department = departmentRepository.findById(deptId).orElseThrow(()-> 
		new RuntimeException("Department not found with id: "+deptId));
		return department;
	}

}
