package com.telusko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBeanLcApplication {

	public static void main(String[] args) {
		System.out.println("Spring IOC container started");
		ConfigurableApplicationContext context = SpringApplication.run(SpringBeanLcApplication.class, args);
		
		Voter voter = context.getBean(Voter.class);
		String msg = voter.checkElegibility(18);
		System.out.println(msg);
		
		context.close();
		System.out.println("Spring IOC container stopped");
	}

}
