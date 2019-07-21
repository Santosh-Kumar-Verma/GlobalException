package com.example.SpringBootGlobalException.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootGlobalException.customException.InvalidException;
import com.example.SpringBootGlobalException.dto.Employee;

@RestController
@RequestMapping(value = "/emp" )
public class EmployeeController {

	
	@PostMapping
	public String saveStudentDtls(@RequestBody Employee employee) {
	     if (employee.getEmpId() == null ) {
	    	 throw new InvalidException("empId can not be null");
	     }
	     System.out.println(employee);
	     return "data saved successfull..";
	}
}
