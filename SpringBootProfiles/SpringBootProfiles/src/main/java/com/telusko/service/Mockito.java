package com.telusko.service;

public class Mockito implements Courses {

	public Mockito(){
		System.out.println("Mockito Bean created");
	}
	@Override
	public Boolean getCourse() {

		System.out.println("Mockito Course is purchased... ");
		return true;
	}

}