package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Passenger {

	@Id
	Integer pid;
	
	String name;
	
	String departure;
	
	String arrival;
	
	String dateOfJourney;
	
}
