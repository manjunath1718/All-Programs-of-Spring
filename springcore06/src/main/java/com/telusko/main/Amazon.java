package com.telusko.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.telusko.services.DeliveryServices;
@Component("amz")
public class Amazon {

	@Autowired
	@Qualifier("bd")
	private DeliveryServices service;//Injection through field
	
	static{
		System.out.println("Amazon class Loaded");
	}
		
	@Autowired
	public Amazon(@Qualifier("fedEx")DeliveryServices service){
		System.out.println("Injection through Constructor");
		this.service=service;
	}
	
	public Amazon() {
		System.out.println("Amazon Bean is Created");
	}

	@Autowired
	@Qualifier("dhl")
	public void setService(DeliveryServices service) {
		System.out.println("Injection through setter");
		this.service = service;
	}
	
	public boolean deliverProduct(Double amt) {
		
		return service.deliveryProduct(amt);
	
	}
}
