package com.example.SpringBootGlobalException.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootGlobalException.customException.InvalidException;
import com.example.SpringBootGlobalException.dto.Student;
import com.example.SpringBootGlobalException.service.IStudentService;

@RestController
@RequestMapping(value = "/student")
public class StudentController {

	@Autowired
	private IStudentService studentService;
	
	@PostMapping
	public String saveStudentDtls(@RequestBody Student student) {
	     if (student.getRoll() == null ) {
	    	 throw new InvalidException("Roll can not be null");
	     }
	     System.out.println(student);
	     return "data saved successfully";
	}
	@GetMapping(value="/getStudentDtls")
	public Object getStudentDtls(@RequestParam("type") String type) {
		if (type.equalsIgnoreCase("normal")) {
			return new Student(101l, "Santosh Kumar Verma", "abad");	
		} else {
			Student student = new Student(1013l, "sumit", "abad");
			if (student.getName().equalsIgnoreCase("sumit")) {
				student.setName(new InvalidException("name can not be sumit").getMessage());
			}
			return student;
		}
		
	}
	@PostMapping(value="/getStudentList")
	public Object getStudentList(@RequestBody Map<String,String> inputMap) {
		return studentService.getStudentDetails(inputMap.get("type"));
		}
	
	
}
