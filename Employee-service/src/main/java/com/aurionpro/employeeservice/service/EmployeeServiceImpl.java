package com.aurionpro.employeeservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.aurionpro.employeeservice.Dto.ApiResponseDto;
import com.aurionpro.employeeservice.Dto.DepartmentResponseDto;
import com.aurionpro.employeeservice.Dto.EmployeeResponseDto;
import com.aurionpro.employeeservice.entity.Employee;
import com.aurionpro.employeeservice.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

//	@Autowired
//	private EmployeeResponseDto employeeResponseDto;

//	@Autowired
//	private ApiResponseDto apiResponseDto;

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public ApiResponseDto getEmployee(int empId) {
		Employee employee = employeeRepository.findById(empId)
				.orElseThrow(() -> new RuntimeException("Employee not found with id: " + empId));

		EmployeeResponseDto employeeResponseDto = new EmployeeResponseDto();
		employeeResponseDto.setEmpId(employee.getEmpId());
		employeeResponseDto.setEmpName(employee.getEmpName());
		employeeResponseDto.setSalary(employee.getSalary());

		ResponseEntity<DepartmentResponseDto> departmentResponseDto = restTemplate.getForEntity(
				"http://localhost:8081/app/department-service/" + employee.getDeptId(), DepartmentResponseDto.class);

		ApiResponseDto apiResponseDto = new ApiResponseDto();
		
		apiResponseDto.setEmployee(employeeResponseDto);
		apiResponseDto.setDepartment(departmentResponseDto.getBody());
		
		return apiResponseDto;
	}
}
