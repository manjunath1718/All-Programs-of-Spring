package com.telusko.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.telusko.config.JavaConfiguration;
import com.telusko.service.GreetMe;

public class LaunchApp {

	public static void main(String[] args) {
		
		ApplicationContext container=new AnnotationConfigApplicationContext(JavaConfiguration.class);
		
		GreetMe g=container.getBean(GreetMe.class);
		
		String str=g.generateWish("Virat");
		System.out.println(str);
		
	}

}
