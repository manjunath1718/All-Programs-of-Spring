package com.telusko.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.telusko.SpringBootProfilesApplication;

@Service
@Profile({"springboot","jen","doc"})
public class SpringBoot implements Courses{

	public SpringBoot(){
//		new SpringBootProfilesApplication().getMockitoBean();
		System.out.println("SpringBoot Bean created");
	}
	
	@Override
	public Boolean getCourse() {
		System.out.println("Spring boot Course is purchased... ");
		return true;
	}

}
