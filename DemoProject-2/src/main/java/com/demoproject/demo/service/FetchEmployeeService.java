package com.demoproject.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demoproject.demo.dto.EmployeeDto;



@Service
public interface FetchEmployeeService {
	
	
	
	public List<EmployeeDto> fetchEmployees();
		
	
}
