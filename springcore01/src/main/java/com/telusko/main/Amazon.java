package com.telusko.main;

import com.telusko.services.DeliveryServices;

public class Amazon {

	private DeliveryServices service;
	
	static{
		System.out.println("Amazon class Loaded");
	}
	
	public Amazon() {
		System.out.println("Amazon Bean is Created");
	}

	public void setService(DeliveryServices service) {
		this.service = service;
	}
	
	public boolean deliverProduct(Double amt) {
		
		return service.deliveryProduct(amt);
	
	}
}
