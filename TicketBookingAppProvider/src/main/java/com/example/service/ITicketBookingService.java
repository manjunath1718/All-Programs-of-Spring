package com.example.service;

import com.example.model.Passenger;

public interface ITicketBookingService {

	public Passenger registerPassenger(Passenger passenger);
	public Passenger fetchPassenger(Integer id);
}
