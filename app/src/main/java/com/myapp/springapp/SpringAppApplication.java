package com.myapp.springapp;

import hello.ApplicationController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan(basePackageClasses = ApplicationController.class)
public class SpringAppApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringAppApplication.class, args);
	}

}
