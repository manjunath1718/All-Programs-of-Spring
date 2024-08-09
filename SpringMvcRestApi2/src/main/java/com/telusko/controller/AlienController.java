package com.telusko.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.controller.pojo.Alien;

//@Controller
@RestController
public class AlienController {

	@GetMapping("/getalien")
//	@ResponseBody
	public Alien getResponse(){
		Alien a1=new Alien();
		a1.setId(101);
		a1.setName("Raj");
		a1.setCity("Bengaluru");
		
		return a1;
	}
}
