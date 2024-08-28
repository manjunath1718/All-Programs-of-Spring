package com.telusko.rest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.service.IGreetingService;

@RestController
public class GreetingController {

	private static final Logger logger=LoggerFactory.getLogger(GreetingController.class);
	
	@Autowired
	IGreetingService service;
	
	@GetMapping("/api1")
	public ResponseEntity<String> greeting() {
		
		logger.info("control in api 1");
		String body = service.generateGreetings();
		logger.debug("Service logic is been invocked and we got response");
		
		return new ResponseEntity<String>(body,HttpStatus.OK);
	}
}
