package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.ITicketRepo;
import com.example.model.Passenger;

@Service
public class TicketBookingServiceImpl implements ITicketBookingService {

	@Autowired
	ITicketRepo repo;
	
	@Override
	public Passenger registerPassenger(Passenger passenger) {
		
		return repo.save(passenger);
	}

	@Override
	public Passenger fetchPassenger(Integer id) {
		Optional<Passenger> optional = repo.findById(id);
		return optional.get();
	}

}
