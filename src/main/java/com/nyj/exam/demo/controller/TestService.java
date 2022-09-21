package com.nyj.exam.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
//@RequestMapping("/api")
public class TestService {
 
	
	@GetMapping("/api/hello")
	public String getHello() {
		return "hello";
	}
	 
}
