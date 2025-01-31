package com.telusko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.telusko.service.Courses;
import com.telusko.service.Mockito;

@SpringBootApplication
public class SpringBootProfilesApplication implements CommandLineRunner {

	@Autowired
	Courses course;

	public static void main(String[] args) {

		System.out.println("main method started");
		SpringApplication.run(SpringBootProfilesApplication.class, args);
		System.out.println("main method ended");

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Run method from CLR");
		Boolean status = course.getCourse();
		if(status) {
			System.out.println("Enrolled course successfully");
		}else {
			System.out.println("Failed to Enroll course ");
		}

	}
	
	@Bean
	@Profile("mockito")
	public  Mockito getMockitoBean(){
		System.out.println("getMockitoBean method get called");
		return new Mockito();
	}

}
