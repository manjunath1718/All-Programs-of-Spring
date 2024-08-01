package com.telusko.service;

import com.telusko.dao.CustomerInfo;

public interface ICustomerService {

	public String registerCustomer(CustomerInfo cx);
	public Iterable<CustomerInfo> fetchAllCxInfo();
}
