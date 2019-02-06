package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;

@RestController
class NumController {

	@PostMapping("/num")
	int newEmployee(int num) {
		return num;
	}

}