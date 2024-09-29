package com.as.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.as.model.employee;

@RestController
public class EmployeeController {

	@PostMapping("/createEmployee")
	public String createEmployee(@RequestBody employee employee ) {
		System.out.println("employee");
		return "hi good morning all of you"; 
	}
}
