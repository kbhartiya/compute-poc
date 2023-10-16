package com.poc.picomp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.poc.picomp")
public class PocApp {
	
	
	public static void main(String[] args) {
		SpringApplication.run(PocApp.class, args);
	}

}
