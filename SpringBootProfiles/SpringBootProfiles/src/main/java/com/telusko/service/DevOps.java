package com.telusko.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("Devops")
public class DevOps implements Courses {

	public DevOps(){
		System.out.println("DevOps Bean created");
	}
	@Override
	public Boolean getCourse() {
		
		System.out.println("DevOps Course is purchased... ");
		return true;
	}

	
}
