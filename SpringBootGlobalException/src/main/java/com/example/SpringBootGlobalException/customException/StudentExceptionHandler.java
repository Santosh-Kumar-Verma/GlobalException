package com.example.SpringBootGlobalException.customException;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class StudentExceptionHandler {

	@ExceptionHandler
	public String handleInvalidException(InvalidException exception) {
		return exception.getMessage();
	}
}
