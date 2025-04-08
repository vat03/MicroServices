package com.aurionpro.employeeservice.service;

import com.aurionpro.employeeservice.Dto.ApiResponseDto;

public interface EmployeeService {
	public ApiResponseDto getEmployee(int empId);
}
