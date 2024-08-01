package com.telusko.dao;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepo extends CrudRepository<CustomerInfo, Integer> {

}
