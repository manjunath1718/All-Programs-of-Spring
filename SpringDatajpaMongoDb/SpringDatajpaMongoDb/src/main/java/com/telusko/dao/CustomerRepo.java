package com.telusko.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepo extends MongoRepository<CustomerInfo, String>{

}
