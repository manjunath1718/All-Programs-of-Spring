package com.telusko.model;

import org.springframework.hateoas.RepresentationModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class Course extends RepresentationModel{
	
	
	Integer cId;
	String cName;
	Double cPrice;
	
	
}
