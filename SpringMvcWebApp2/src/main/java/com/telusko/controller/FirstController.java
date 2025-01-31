package com.telusko.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping("controller1")
public class FirstController {

//	@RequestMapping(value="/welcome",method=RequestMethod.GET)
//	@RequestMapping("/welcome")
	@GetMapping("welcome")
	public String displaySomeMessage1(Model model) {
		
		System.out.println("Model is implemented by "+model.getClass().getName());
		model.addAttribute("message", "Hi! folks Welcome back");
		return "home";
	}
	
	@PostMapping("welcome")
	public String displaySomeMessage2(Model model) {
		
		System.out.println("Model is implemented by "+model.getClass().getName());
		model.addAttribute("message", "Hi! GoodMorning ");
		return "home";
	}
	
	@GetMapping("welcome2")
	public String displaySomeMessage3(Map<String,Object> map) {
		map.put("message", "I hope you're learning SpringBoot very well");
		return "home";//LVN->logical View Name
	}
	
	@GetMapping("advice")
	public void displaySomeMessage4(Map<String,Object> map) {
		
		System.out.println("Model is implemented by "+map.getClass().getName());		
		map.put("key","Shape your skill, Shape your success");
		return; 
		//when end point and LVN name matches we don't need to returning LVN explicitly 
	}
	
}
