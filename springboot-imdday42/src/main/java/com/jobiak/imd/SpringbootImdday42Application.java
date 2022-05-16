package com.jobiak.imd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import com.jobiak.imd.repository.CustomerRepo;

@SpringBootApplication  //(scanBasePackages={"com.jobiak.imd","com.jobiak.model","com.jobiak.respiratory"})
public class SpringbootImdday42Application {

	public static void main(String[] args) {
		System.out.println("spring boot app");
		
		SpringApplication.run(SpringbootImdday42Application.class, args);
		System.out.println("started boot app");
	}

}
