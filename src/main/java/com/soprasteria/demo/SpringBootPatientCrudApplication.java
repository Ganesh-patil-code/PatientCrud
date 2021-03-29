package com.soprasteria.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.soprasteria.repository")
@EntityScan("com.soprasteria.model")
@SpringBootApplication(scanBasePackages = "com.soprasteria")
public class SpringBootPatientCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPatientCrudApplication.class, args);
		System.out.println("hi by ");
	}
}
