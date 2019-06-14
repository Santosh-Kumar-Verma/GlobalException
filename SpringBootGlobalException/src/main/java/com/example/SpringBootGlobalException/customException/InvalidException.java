package com.example.SpringBootGlobalException.customException;

public class InvalidException extends RuntimeException{
	
	private String message;

	public InvalidException(String message) {
		super(message);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

}
