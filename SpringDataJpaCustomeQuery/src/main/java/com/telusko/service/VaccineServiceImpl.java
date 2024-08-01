package com.telusko.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.telusko.dao.IVaccineRepo;
import com.telusko.dao.Vaccine;

@Service
public class VaccineServiceImpl implements IVaccineService {

	@Autowired
	IVaccineRepo repo;

	@Override
	public List<Vaccine> searchByVaccineCompanyName(String company) {
		
		return repo.searchByVaccineCompanyName(company);
	}

	@Override
	public List<Vaccine> searchByVaccineCompanyNames(String... companyNames) {
		
		return repo.searchByVaccineCompanyNames(companyNames);
	}

	@Override
	public List<Vaccine> searchByVaccinePriceRange(Integer minCost, Integer maxCost) {
		
		return repo.searchByVaccinePriceRange(minCost, maxCost);
	}

	@Override
	public List<String[]> searchVaccineInfoByVaccineName(String vac1, String vac2) {
		
		return repo.searchVaccineInfoByVaccineName(vac1, vac2);
	}

	@Override
	public int updatePriceByVaccineName(String vaccineName, Double newCost) {
		
		return repo.updatePriceByVaccineName(vaccineName, newCost);
	}

	@Override
	public int deleteByVaccinePriceRange(Integer minCost, Integer maxCost) {
		
		return repo.deleteByVaccinePriceRange(minCost, maxCost);
	}

	@Override
	public int insertVaccineDetails(Integer id,String vaccineName, String vaccineCompany, Double cost) {
		
		return repo.insertVaccineDetails(id,vaccineName, vaccineCompany, cost);
	}

	

	

	
	

	

	
	
	

}
