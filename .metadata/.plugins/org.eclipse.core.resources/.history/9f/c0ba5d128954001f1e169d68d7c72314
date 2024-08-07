package com.telusko.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("/home")
	public String showHomePage(){
		
		return "home";
	}
	
	@GetMapping("/response")
	public String getSomeResponse(Map<String,Object> map) {
		
		String[] books=new String[] {"Java","SpringBoot","JUnit"};
		map.put("books", books);
		return "response";
	}
}
