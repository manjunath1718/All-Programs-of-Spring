package com.telusko.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.telusko.dao.Vaccine;

public interface IVaccineService {
	
	public Iterable<Vaccine> searchByGivenVaccineInfo(Vaccine vacc,boolean status,String...properties);
	public Vaccine searchVaccineById(Integer id);
	public List<Vaccine> searchVaccineByObject(Vaccine vaccine);
    public String removeVaccinesByIds(List<Integer> ids);

}
