package com.aurionpro.employeeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aurionpro.employeeservice.Dto.ApiResponseDto;
import com.aurionpro.employeeservice.service.EmployeeService;

@RestController
@RequestMapping("/app/employee-service")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/{empId}")
	public ResponseEntity<ApiResponseDto> getEmployee(@PathVariable int empId) {
		return ResponseEntity.ok(employeeService.getEmployee(empId));
	}
}
