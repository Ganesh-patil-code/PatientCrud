package com.soprasteria.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.soprasteria")
public class SpringBootPatientCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPatientCrudApplication.class, args);
		System.out.println("hi by");
	}

}
