package com.akash.SPRINGDATAJPA_EXAMPLE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@Autowired //must use autowired for automatic dependency injection
	StudentRepositary repo;
	
	@PostMapping("/signup")
	public String addStudent() {
		Student s = new Student("Akash");
		repo.save(s);
		return "Student added";
	}
}
