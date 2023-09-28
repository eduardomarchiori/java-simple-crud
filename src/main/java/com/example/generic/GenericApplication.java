package com.example.generic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GenericApplication {

	public static void main(String[] args) {
		System.out.println("Hello!");
		SpringApplication.run(GenericApplication.class, args);
	}

}
