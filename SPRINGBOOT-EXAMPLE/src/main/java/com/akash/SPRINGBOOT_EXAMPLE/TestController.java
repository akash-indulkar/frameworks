package com.akash.SPRINGBOOT_EXAMPLE;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@GetMapping("/")
	public String showMessage() {
		return "Hello World from Spring Boot!";
	}
}
