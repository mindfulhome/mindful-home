package com.educare.mindfulhome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.SpringVersion;

@SpringBootApplication
public class MindfulHomeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MindfulHomeApplication.class, args);
		System.out.println("Spring version: " + SpringVersion.getVersion());
	}

}
