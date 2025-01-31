package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Tourist;
import com.example.service.ITouristService;

@RestController
@RequestMapping("/api")
public class TouristRestController {

	@Autowired
	ITouristService service;

	@PostMapping("/register")
	public ResponseEntity<String> enrollTourist(@RequestBody Tourist tourist){
		
		String msg=service.registerTourist(tourist);
		return new ResponseEntity<String>(msg, HttpStatus.OK);

	}


	@GetMapping("/findAll")
	public ResponseEntity<?> fetchAllTourists(){

		List<Tourist> list = service.fetchAllTourists();
		return new ResponseEntity<>(list, HttpStatus.OK);

	}

	@GetMapping("/findById/{id}")
	public ResponseEntity<?> fetchTourist(@PathVariable("id") Integer id){

		Tourist tourist = service.fetchTouristInfoById(id);
		return new ResponseEntity<>(tourist, HttpStatus.OK);

	}

	@PutMapping("/update")
	public ResponseEntity<String> updateTouristInfo(@RequestBody Tourist tourist){

		String msg=service.updateTouristInfo(tourist);
		return new ResponseEntity<String>(msg, HttpStatus.OK);

	}

	@PatchMapping("/updatebudget/{id}/{budget}")
	public ResponseEntity<String> updateTouristInfo(@PathVariable()Integer id, 
			@PathVariable("budget")Double budget){
		String msg=service.updateTouristInfoById(id, budget);
		return new ResponseEntity<String>(msg, HttpStatus.OK);
		
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteTouristInfo(@PathVariable("id")Integer id){

		String msg=service.deleteTouristById(id);
		return new ResponseEntity<String>(msg, HttpStatus.OK);

	}


}
