package com.telusko.controller;

import java.time.LocalTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GreetController {

	@GetMapping("/welcome")
	public String getWelcomeMsg(){
		String body="Hi folks welcome back";
		return body;
	}
	
	@GetMapping("/welcome2")
	public String getWelcomeMsg(@RequestParam(value="name",required = false,
	defaultValue = "pavya")String name){
		String body="Hi "+name+" welcome back";
		return body;
	}
	
	@GetMapping("/welcome3/{name}")
	public String getWelcomeMsg2(@PathVariable(value="name",required = false
	)String name){
		String body="Hi "+name+" welcome back to Rest Api App";
		return body;
	}
	
}
