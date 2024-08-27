package com.telusko.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.model.Customer;

public interface ICustomerRepo extends JpaRepository<Customer, Integer> {

}
