package com.aurionpro.employeeservice.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class ApiResponseDto {
	private EmployeeResponseDto employee;
	private DepartmentResponseDto department;
}
