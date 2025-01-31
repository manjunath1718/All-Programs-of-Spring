package com.telusko.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.model.Tourist;
import com.telusko.service.IGreetingService;

@RestController
@RequestMapping("/api")
public class GreetController {
	
	@Autowired
	IGreetingService service;

	@GetMapping("/greet")
	public ResponseEntity<String> generateGreet(){
		
		String wish=service.greet();
		
		return new ResponseEntity<String>(wish, HttpStatus.OK);
	}
	
	@PostMapping("/registerTourist")
	public ResponseEntity<String> registerTourist(@RequestBody Tourist tourist){
		
		boolean status = service.acceptTourist(tourist);
		
		String msg;
		if(status) {
			msg="Tourist Info registered successfully";
			return new ResponseEntity<String>(msg, HttpStatus.CREATED);
		}else {
			msg="Tourist Info not able registered something went wrong";
			return new ResponseEntity<String>(msg, HttpStatus.BAD_REQUEST);
		}
		
	}
	
	
}
