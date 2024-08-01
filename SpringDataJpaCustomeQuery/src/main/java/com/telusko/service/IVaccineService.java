package com.telusko.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.telusko.dao.Vaccine;

public interface IVaccineService {
	
	
	public List<Vaccine> searchByVaccineCompanyName(String company);
	public List<Vaccine> searchByVaccineCompanyNames(String...companyNames);
	public List<Vaccine> searchByVaccinePriceRange(Integer minCost,Integer maxCost);

	public List<String[]> searchVaccineInfoByVaccineName(String vac1,String vac2);
	public int updatePriceByVaccineName(String vaccName,Double newCost);
	public int deleteByVaccinePriceRange(Integer minCost,Integer maxCost);
	public int insertVaccineDetails(Integer id,String vaccineName, String vaccineCompany, Double cost);
	
	
}
