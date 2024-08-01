package com.telusko.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.telusko.bean.Employee;

public class LaunchApp3 {

	public static void main(String[] args) {
		ApplicationContext container=new ClassPathXmlApplicationContext("applicationconfig.xml");

		Employee eBean1=container.getBean("emp1",Employee.class);
		String str=eBean1.employeeTask();
		System.out.println(str);
		System.out.println(eBean1);
		
		System.out.println("*****************************************************");
		
		Employee eBean2=container.getBean("emp2",Employee.class);	
		System.out.println(eBean2);
		
		System.out.println("*****************************************************");
		
		Employee eBean3=container.getBean("emp3",Employee.class);	
		System.out.println(eBean3);
		

	}

}
