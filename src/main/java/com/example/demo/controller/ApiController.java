package com.example.demo.controller;

import java.net.URI;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.model.Student;

@RestController
@RequestMapping("api")
public class ApiController {

	@GetMapping("/string")
	public String getString() {
		return "String";
	}
	
	@GetMapping("/jsons")
	public ResponseEntity<Student> json(){
		 Student createdStudent = new Student();
		 return new ResponseEntity<Student>(createdStudent, HttpStatus.OK);
	}
}


