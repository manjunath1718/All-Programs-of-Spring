package com.telusko.services;

import org.springframework.stereotype.Component;

@Component("bd")
public class BlueDart implements DeliveryServices {
	
	static{
		System.out.println("BlueDart class Loaded");
	}
	
	public BlueDart() {
		System.out.println("BlueDart Bean is Created");
	}

	public Boolean deliveryProduct(Double amt) {
		System.out.println("Product Delivered with BlueDart Service and amount paid is "+amt);
		return true;
	}

}
