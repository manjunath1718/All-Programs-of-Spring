package com.telusko.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaunchApp {

	public static void main(String[] args) {
		
		ApplicationContext container=new ClassPathXmlApplicationContext("applicationconfig.xml");
		
		Amazon amz=container.getBean(Amazon.class);
		
		Boolean status=amz.deliverProduct(5500.00);
		
		if(status) {
			System.out.println("product delivered");
		}
		else {
			System.out.println("product Failed to delivered");
		}
		
	}

}
