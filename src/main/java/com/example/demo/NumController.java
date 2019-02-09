package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class NumController {

	@CrossOrigin
	@GetMapping("/num")
	double newNum() {
		return Math.random();
	}

}