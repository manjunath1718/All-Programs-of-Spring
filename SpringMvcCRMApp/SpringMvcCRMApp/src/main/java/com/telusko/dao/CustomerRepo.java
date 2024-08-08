package com.telusko.dao;

import org.springframework.data.repository.CrudRepository;

import com.telusko.model.Customer;

public interface CustomerRepo extends CrudRepository<Customer, Integer>{

}
