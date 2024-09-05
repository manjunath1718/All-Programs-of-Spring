package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.example.dao.ITicketRepo;

@Service
@Scope("prototype")
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TicketService2 {

	@Autowired
	ITicketRepo repo;
	
	public TicketService2(){
		
		System.out.println("Ticket service 2 bean created");
	}
	
	public void someMessage() {
		
		System.out.println("Repo hashcode "+repo.hashCode());
		long count = repo.count();
		System.out.println("No of Records "+count);
	}
}
