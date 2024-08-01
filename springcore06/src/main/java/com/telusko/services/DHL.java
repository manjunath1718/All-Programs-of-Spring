package com.telusko.services;

import org.springframework.stereotype.Component;

@Component("dhl")
public class DHL implements DeliveryServices {
	
	static{
		System.out.println("DHL class Loaded");
	}
	
	public DHL() {
		System.out.println("DHL Bean is Created");
	}

	public Boolean deliveryProduct(Double amt) {
		System.out.println("Product Delivered with DHL Service and amount paid is "+amt);
		return true;
	}

}
