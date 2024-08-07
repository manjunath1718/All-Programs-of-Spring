package com.telusko.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PathParam {

	@GetMapping("/getmsg/{name}/{course}")
	String getSomeMsg(@PathVariable String name,@PathVariable("course") String c,Model model) {
		
		model.addAttribute("msg","hi "+name+" I hope you're enjoying "+c);
		return "index";
	}
}
