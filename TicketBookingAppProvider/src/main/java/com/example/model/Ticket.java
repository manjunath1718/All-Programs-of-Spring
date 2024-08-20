package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {
	
	Integer ticketNumber;
	
	String status;
	
	Double ticketCost;
	
	String name;
	
	String departure;
	
	String arrival;
	
	String dateOfJourney;
	

}
