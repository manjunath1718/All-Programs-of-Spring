package com.telusko.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.telusko.model.Employee;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class RegController {

	@GetMapping("/register")
	public String home(){
//		System.out.println("hi");
		return "register";
	}
	
//	@PostMapping("/register")
//	public String register(Model model,HttpServletRequest request) {
//
//		String sid = request.getParameter("id");
//		Integer id= Integer.parseInt(sid);//Integer.valueOf(sid);		
//		model.addAttribute("id", id);
//	
//		return "response";
//	}
	
	@PostMapping("/register")
	public String register(@ModelAttribute Employee emp,Model model) {
//		System.out.println(emp);
		model.addAttribute("impl", emp);
		return "response";
	}
}
