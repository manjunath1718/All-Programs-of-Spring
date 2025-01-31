package com.telusko.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.model.Alien;
import com.telusko.service.IAlienService;

@RestController
public class AlienController {

	@Autowired
	IAlienService service;
	
	@PostMapping("/register")
	public ResponseEntity<Alien> registerAlien(@RequestBody Alien alien){
		
		Alien al = service.registerAlien(alien);
		return new ResponseEntity(al,HttpStatus.CREATED);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Alien>> fetchAllAliens(){
		
		 List<Alien> list = service.fetchAllAlien();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping("/alienbyid/{id}")
	public ResponseEntity<Alien> getAlenById(@PathVariable Integer id){
		
		 Alien al = service.fetchAlienById(id);
		return ResponseEntity.ok(al);
	}
	
	
	
}
