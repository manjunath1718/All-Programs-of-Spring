package com.telusko.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping;

import com.telusko.service.IGreetingService;

import jakarta.servlet.http.HttpServletResponse;

@Controller
public class GreetingController {

	@Autowired
	IGreetingService service;
	
//	@GetMapping("/greet")
//	public String getGreetings(Map<String,Object> map) {
	@GetMapping("/greetings")
	public void getGreetings(Map<String,Object> map) {
		System.out.println(map.getClass());
		map.put("wish", service.generateGreetings());
//		return "greetings";
	}
	
	@GetMapping("/greet1")
	public Map<String,Object> getGreeting1() {

		Map<String,Object> map=new HashMap<>();
		map.put("wish", service.generateGreetings());
		return map;
	}
	
	@GetMapping("/greet2")
	public void getGreeting2(HttpServletResponse response) throws IOException {
		
		PrintWriter writer = response.getWriter();
		writer.println("<h1> this response directly coming from servlet "+service.generateGreetings()+"</h1>"); 
	}
	
}
