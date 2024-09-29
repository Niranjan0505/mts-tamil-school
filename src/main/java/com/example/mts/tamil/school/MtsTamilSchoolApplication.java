package com.example.mts.tamil.school;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients

public class MtsTamilSchoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(MtsTamilSchoolApplication.class, args);
	}

}
