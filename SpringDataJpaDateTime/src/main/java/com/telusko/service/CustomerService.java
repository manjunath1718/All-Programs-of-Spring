package com.telusko.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.dao.CustomerInfo;
import com.telusko.dao.CustomerRepo;

@Service
public class CustomerService implements ICustomerService {

	@Autowired
	CustomerRepo repo;
	
	@Override
	public String registerCustomer(CustomerInfo cx) {

		return "Customer Info registered with id "+repo.save(cx).getId();
	}

	@Override
	public Iterable<CustomerInfo> fetchAllCxInfo() {
		
		return repo.findAll();
	}

}
