package com.demoproject.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.demoproject.demo.dto.EmployeeDto;
import com.demoproject.demo.service.FetchEmployeeService;

@RestController
public class RestTemplateController {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/fetchEmployees")
	public List<EmployeeDto> fetchEmployees(){		
		String apiUrl = "http://localhost:9098/getallemployee";
		ResponseEntity<EmployeeDto[]> response = restTemplate.getForEntity(apiUrl, EmployeeDto[].class);
		EmployeeDto[] empArr = response.getBody();		
		return Arrays.asList(empArr);		
		
	}
}
