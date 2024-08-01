package com.telusko.SpringBoot01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot01Application {

	public SpringBoot01Application(){
		
		System.out.println("SpringBoot01Application Bean Created");
	}
	
	public static void main(String[] args) {
		ApplicationContext container = SpringApplication.run(SpringBoot01Application.class, args);
	
		System.out.println(container.getClass().getName());
		System.out.println("No of Beans Created in container =>"+container.getBeanDefinitionCount());
		String[] beanNames = container.getBeanDefinitionNames();
		
		for(String name:beanNames) {
			
			System.out.print(name+" ==> ");
		}
		
		
		Student std = container.getBean(Student.class);	
		std.initializedData();
		
	}

}
