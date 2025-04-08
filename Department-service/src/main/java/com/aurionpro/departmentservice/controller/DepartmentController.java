package com.aurionpro.departmentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aurionpro.departmentservice.entity.Department;
import com.aurionpro.departmentservice.service.DepartmentService;

@RestController
@RequestMapping("/app/department-service")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	@GetMapping("/{deptId}")
	public ResponseEntity<Department> getDepartment(@PathVariable int deptId) {
		return ResponseEntity.ok(departmentService.getDepartment(deptId));
	}
}
