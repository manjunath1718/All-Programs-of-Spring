package com.example.reqres;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Passenger {

	Integer pid;
	
	String name;
	
	String departure;
	
	String arrival;
	
	String dateOfJourney;
	
}
