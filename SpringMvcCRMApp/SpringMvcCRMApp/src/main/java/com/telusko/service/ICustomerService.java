package com.telusko.service;

import java.util.List;

import com.telusko.model.Customer;

public interface ICustomerService {

	public List<Customer> getAllCx();
	public void registerCustomer(Customer customer);
	public void deleteCustomer(Integer id);
}
