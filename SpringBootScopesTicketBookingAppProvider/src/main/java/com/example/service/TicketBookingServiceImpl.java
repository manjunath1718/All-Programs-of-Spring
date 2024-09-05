package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.example.dao.ITicketRepo;
import com.example.model.Passenger;

@Service
@Scope("prototype")
public class TicketBookingServiceImpl implements ITicketBookingService {

	@Autowired
	ITicketRepo repo;
	
	public TicketBookingServiceImpl(){
		
		System.out.println("TicketBooking service bean created");
	}
	
	@Override
	public Passenger registerPassenger(Passenger passenger) {
		
		return repo.save(passenger);
	}

	@Override
	public Passenger fetchPassenger(Integer id) {
		
		System.out.println("Repo hashcode "+repo.hashCode());
		Optional<Passenger> optional = repo.findById(id);
		return optional.get();
	}

}
