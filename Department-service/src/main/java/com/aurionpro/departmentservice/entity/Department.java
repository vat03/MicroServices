package com.aurionpro.departmentservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Entity
@Table(name = "departments")
public class Department {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int deptId;
	
	@Column
	private String deptName;
}
