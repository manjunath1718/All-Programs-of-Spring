package com.telusko.services;

import org.springframework.stereotype.Component;

@Component("fedEx")
public class FedEx implements DeliveryServices {
	
	static{
		System.out.println("FedEx class Loaded");
	}
	
	public FedEx() {
		System.out.println("FedEx Bean is Created");
	}

	public Boolean deliveryProduct(Double amt) {
		System.out.println("Product Delivered with FedEx Service and amount paid is "+amt);
		return true;
	}

}
