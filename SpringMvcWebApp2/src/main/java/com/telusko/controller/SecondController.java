package com.telusko.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("controller2")
public class SecondController {

//	@GetMapping("welcome1")
	@GetMapping("welcome")
	public String getSomeMessage(Model model) {
		System.out.println("Model is implemented by "+model.getClass().getName());
		model.addAttribute("message", "focus is key to master any skill");
		return "home";
	}
}