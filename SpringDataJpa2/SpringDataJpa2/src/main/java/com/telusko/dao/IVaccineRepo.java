package com.telusko.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface IVaccineRepo extends CrudRepository<Vaccine, Integer> {
	
	public List<Vaccine> findVaccineByVaccineCompany(String vaccineName);
	 
}
