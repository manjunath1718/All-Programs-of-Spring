package com.telusko;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@PropertySource(value="classpath:application.properties")
public class Voter {
	
	@Value("${voter.info.name}")
	String name;
	
	@Value("${voter.info.id}")
	Integer id;

	static {
		System.out.println("Voter class is loaded");
	}
	
	public Voter() {
		System.out.println("Voter Bean created");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Init method getting invocked post constructor");
	}
	
	public String checkElegibility(int age) {

		System.out.println("Hello! "+name+" your id is "+id);
		if(age<18)
			return "Have Patience your time will come to vote";
		else
			return "You're eligible to vote";
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("destroyed");
	}
	
	
}
