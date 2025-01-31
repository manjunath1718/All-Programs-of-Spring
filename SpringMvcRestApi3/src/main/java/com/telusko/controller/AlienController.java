package com.telusko.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.controller.pojo.Alien;

@RestController
public class AlienController {

	@GetMapping("/getalien")
	public ResponseEntity<Alien> getAlienInfo(){
		Alien a1=new Alien();
		a1.setId(101);
		a1.setName("Raj");
		a1.setCity("Bengaluru");
		
		return new ResponseEntity<>(a1,HttpStatus.OK);
	}
	
	@PostMapping("/register")
	public ResponseEntity<String> reisterAlien(@RequestBody Alien alien){
		
		System.out.println(alien);
		String msg="Alien info registered successful";
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
	
}
