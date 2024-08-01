package com.telusko.SpringBoot01;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	Integer id;
	String name;

	public Student(){
		System.out.println("Student Bean is Created");
	}
	
	public void initializedData() {
		
		name="vishal";
		id=1;
		System.out.println("Name ==>"+name+" ID ==>"+id);
	}
}
