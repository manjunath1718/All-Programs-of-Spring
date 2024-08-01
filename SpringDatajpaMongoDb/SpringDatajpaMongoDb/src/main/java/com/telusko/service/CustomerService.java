package com.telusko.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.dao.CustomerInfo;
import com.telusko.dao.CustomerRepo;
import com.telusko.dto.CustomerDto;

@Service
public class CustomerService implements ICustomerService {

	@Autowired
	CustomerRepo repo;
	
	@Override
	public String registerCustomer(CustomerDto dto) {
		
		CustomerInfo c=new CustomerInfo();
		BeanUtils.copyProperties(dto, c);
		
		return "Customer Doc stored in Mongodb with Id "+repo.save(c).getId();
	}

	@Override
	public Iterable<CustomerInfo> fetchAllCx() {
		
		return repo.findAll();
	}
	
	@Override
	public String deleteCustomerInfoById(String id) {
		Optional<CustomerInfo> opt = repo.findById(id);
		if(opt.isPresent()) {
			repo.deleteById(id);
			return "Customer Doc with Id "+id+" deleted ";
		}
		return "Document is not present in Db with id "+id;
	}

	

}
