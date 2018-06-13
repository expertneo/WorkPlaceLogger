package com.homeproject.workplacelogger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.homeproject.workplacelogger")
public class WorkPlaceLoggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkPlaceLoggerApplication.class, args);
	}
}
