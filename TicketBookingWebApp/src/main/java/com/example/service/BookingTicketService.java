package com.example.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

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
		
		RestTemplate restTemplate=new RestTemplate();
		ResponseEntity<Ticket> responseEntity = restTemplate.postForEntity(BOOKING_URL, passenger, Ticket.class);
		
		return responseEntity.getBody();
	}

	@Override
	public Ticket getTicketInfo(Integer ticketNumber) {
		
		RestTemplate restTemplate=new RestTemplate();
		Ticket ticket = restTemplate.getForObject(GET_URL, Ticket.class, ticketNumber);
		return ticket;
	}

}
