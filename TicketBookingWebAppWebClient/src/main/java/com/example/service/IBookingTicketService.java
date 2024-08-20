package com.example.service;

import com.example.reqres.Passenger;
import com.example.reqres.Ticket;

public interface IBookingTicketService {

	public Ticket bookTicket(Passenger passenger);
	public Ticket getTicketInfo(Integer ticketNumber);
}
