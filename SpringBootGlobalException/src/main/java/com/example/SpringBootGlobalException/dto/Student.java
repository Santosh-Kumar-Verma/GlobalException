package com.example.SpringBootGlobalException.dto;

public class Student {

	private Long roll;
	private String name;
	private String address;
	
	public Long getRoll() {
		return roll;
	}
	public void setRoll(Long roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @param roll
	 * @param name
	 * @param address
	 */
	public Student(Long roll, String name, String address) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
}
