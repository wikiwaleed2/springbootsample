package com.example.demo.model;

public class Student{
	
	private String name;
	private String email;
	
	public Student() {
		this.setName("sample name");
		this.setEmail("email@example.com");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
