package com.example.advice;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.exception.TouristNotFoundException;

@RestControllerAdvice
public class TouristErrorAdvice {

	@ExceptionHandler(TouristNotFoundException.class)
	public ResponseEntity<TouristErrorDetails> handlingTouristNotFound(TouristNotFoundException e){
		
		TouristErrorDetails err=new TouristErrorDetails("404 Not Found", e.getMessage(), LocalDateTime.now());		
		return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<TouristErrorDetails> handleExceptionGlobally(Exception e){
	
		TouristErrorDetails err=new TouristErrorDetails("404 Not Found", e.getMessage(), LocalDateTime.now());
		return new ResponseEntity<TouristErrorDetails>(err, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
