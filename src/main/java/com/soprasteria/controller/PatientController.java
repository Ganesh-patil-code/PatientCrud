package com.soprasteria.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class PatientController {

	@RequestMapping("/show")
	public String get() {
		return "ganesh patil";
	}
	
}
