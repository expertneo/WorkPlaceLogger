package com.homeproject.workplacelogger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.homeproject.workplacelogger.Repository.ActivityRepository",
		"com.homeproject.workplacelogger.Service.ActivityServiceImpl",
		"com.homeproject.workplacelogger.Repository.UserRepository",
		"com.homeproject.workplacelogger.Service.UserServiceImpl" })
public class WorkPlaceLoggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkPlaceLoggerApplication.class, args);
	}
}
