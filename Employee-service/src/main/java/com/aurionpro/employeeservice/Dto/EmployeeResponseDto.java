package com.aurionpro.employeeservice.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class EmployeeResponseDto {
	private int empId;
	private String empName;
	private double salary;
}
