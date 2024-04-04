package com.demoproject.demo.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.demoproject.demo.dto.EmployeeDto;
import com.demoproject.demo.service.FetchEmployeeService;

@Service
public class FetchEmployeeServiceImpl implements FetchEmployeeService{

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public List<EmployeeDto> fetchEmployees() {
		String apiUrl = "http://localhost:9098/getallemployee";
		ResponseEntity<EmployeeDto[]> response = restTemplate.getForEntity(apiUrl, EmployeeDto[].class);
		EmployeeDto[] empArr = response.getBody();		
		return Arrays.asList(empArr);
	}

	
}
