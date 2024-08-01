package com.telusko.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.telusko.beans.Employee;
import com.telusko.beans.Department;
public class LaunchApp {

	public static void main(String[] args) {

		ApplicationContext container=new ClassPathXmlApplicationContext("applicationconfig.xml");
		Employee emp1=container.getBean(Employee.class);

		System.out.println(emp1);

		System.out.println("*********************************************");

		Department depart=container.getBean(Department.class);
		System.out.println(depart);

	}

}
