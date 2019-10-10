package com.threadblocked.experiment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableAsync
@ComponentScan(value = "com.threadblocked")
public class ExperimentApplication {

	private String s = "123";

	public static void main(String[] args) {
		SpringApplication.run(ExperimentApplication.class, args);
	}

}
