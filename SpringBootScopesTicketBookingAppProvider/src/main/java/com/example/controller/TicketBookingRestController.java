package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Passenger;
import com.example.model.Ticket;
import com.example.service.ITicketBookingService;
import com.example.service.TicketService2;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

//http://localhost:8484/TicketBookingApp/swagger-ui/index.html
@RestController
//@Scope("prototype")
//@Scope("request")
@Scope("session")
@RequestMapping("/provider/api")
@Tag(name = "TicketBookingAPI's", description = "API's to book Ticket and get Ticket details")
public class TicketBookingRestController {
	
	@Autowired
	ITicketBookingService service;
	
	@Autowired
	TicketService2 service2;
	
	@Autowired
	private ITicketBookingService service1;
	
	public TicketBookingRestController(){
		
		System.out.println("RestAPi ticket crontroller bean created");		
	}

	@PostMapping("/getTicketNumber")
	@Operation(summary = "POST request",description = "Api will accept json passenger info and will return ticket number ")
	public ResponseEntity<Ticket> registerPassenger(@RequestBody Passenger passenger){
		
		Passenger pass = service.registerPassenger(passenger);
		Ticket ticket = new Ticket();
		ticket.setTicketNumber(pass.getPid());
		return new ResponseEntity<>(ticket, HttpStatus.OK);
	}
	
	@GetMapping("/getTicket/{ticketNumber}")
	@Operation(summary = "GET Operation",description = "Api will accept ticket Number and will return Full ticket Info of that ticket number")	
	public ResponseEntity<Ticket> getMyFullTicket(@PathVariable("ticketNumber") Integer id){
		
		Ticket ticket = new Ticket();
		
		service2.someMessage();
		Passenger passenger = service.fetchPassenger(id);
		
		ticket.setStatus("confirmed");
		ticket.setTicketCost(5000.0);
		ticket.setTicketNumber(passenger.getPid());
		ticket.setName(passenger.getName());
		ticket.setArrival(passenger.getArrival());
		ticket.setDeparture(passenger.getDeparture());		
		ticket.setDateOfJourney(passenger.getDateOfJourney());
		
		return new ResponseEntity<>(ticket, HttpStatus.OK);
	}
	
	
	
	
}