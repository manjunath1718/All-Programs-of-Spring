package com.example.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.reqres.Passenger;
import com.example.reqres.Ticket;

@Service
public class BookingTicketService implements IBookingTicketService {

	private String BOOKING_URL = 
			"http://localhost:8484/TicketBookingApp/provider/api/getTicketNumber";
	private String GET_URL = 
			"http://localhost:8484/TicketBookingApp/provider/api/getTicket/{ticketNumber}";

	@Override
	public Ticket bookTicket(Passenger passenger) {

//		RestTemplate restTemplate=new RestTemplate();
//		ResponseEntity<Ticket> responseEntity = restTemplate.postForEntity(BOOKING_URL, passenger, Ticket.class);
//		return responseEntity.getBody();
		
		WebClient webClient = WebClient.create();
		Ticket ticket = webClient.post()
		.uri(BOOKING_URL)
		.bodyValue(passenger)
		.retrieve()
		.bodyToMono(Ticket.class).block();
		
		return ticket;
	}

	@Override
	public Ticket getTicketInfo(Integer ticketNumber) {

//		RestTemplate restTemplate=new RestTemplate();
//		Ticket ticket = restTemplate.getForObject(GET_URL, Ticket.class, ticketNumber);
//		return ticket;
		
		Ticket ticket = WebClient.create()
		.get()
		.uri(GET_URL,ticketNumber)
		.retrieve()
		.bodyToMono(Ticket.class)
		.block();
		
		return ticket;
	}

}
