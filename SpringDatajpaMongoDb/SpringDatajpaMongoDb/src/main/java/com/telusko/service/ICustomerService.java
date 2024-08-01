package com.telusko.service;

import com.telusko.dao.CustomerInfo;
import com.telusko.dto.CustomerDto;

public interface ICustomerService {

	public String registerCustomer(CustomerDto dto);
	public Iterable<CustomerInfo> fetchAllCx();
	public String deleteCustomerInfoById(String id);
}
