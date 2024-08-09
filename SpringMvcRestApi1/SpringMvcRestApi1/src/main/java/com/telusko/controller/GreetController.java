package com.telusko.controller;

import java.time.LocalTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
@RequestMapping("/api1")
public class GreetController {

	@GetMapping("/greet")
//	@ResponseBody
	public ResponseEntity<String> generateGreet(){
		
		int hour=LocalTime.now().getHour();
		String wish=null;
		if(hour<12){
			
    		wish="Good Morning";
    	}
    	else if(hour<16){
    		
    		wish="Good Afternoon";
    	}
    	else if(hour<20){
    		
    		wish="Good Evening";
    	}
    	else{
    		wish="Good night";
    	}
		
		return new ResponseEntity<String>(wish, HttpStatus.OK);
	}
}
