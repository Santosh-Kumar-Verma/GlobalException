package com.example.SpringBootGlobalException.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.SpringBootGlobalException.customException.InvalidException;
import com.example.SpringBootGlobalException.dto.Student;
import com.example.SpringBootGlobalException.service.IStudentService;

@Service
public class StudentService implements IStudentService {

	
	@Override
	@ExceptionHandler(InvalidException.class)
	public Object getStudentDetails(String type) {
		if (type.equalsIgnoreCase("studentData")) {
			@SuppressWarnings("serial")
			List<Student> studentList = new ArrayList<Student>() {{
				add(new Student(101l, "ganesh", "Abad"));
				add(new Student(102l, "Ramesh", "Abad"));
				add(new Student(103l, "nagash", "Abad"));
				add(new Student(104l, "Sayam", "Abad"));
				add(new Student(105l, "Rajiv", "Abad"));
			}};
			return studentList;
		} else {
			return new InvalidException("Exception occured at getStudentDetails() in StudentService class ").getMessage();
		}
	}

}
