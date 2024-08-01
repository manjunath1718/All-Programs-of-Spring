package com.telusko.service;

import java.util.ArrayList;
import java.util.Collection;
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
	public List<Vaccine> findByCost(Double cost) {
		
		return repo.findByCost(cost);
	}

	@Override
	public List<Vaccine> findByVaccineCompanyIs(String company) {
		
		return repo.findByVaccineCompanyIs(company);
	}

	@Override
	public List<Vaccine> findByCostLessThan(Double cost) {
		
		return repo.findByCostLessThan(cost);
	}

	@Override
	public List<Vaccine> findByCostIn(Double... cost) {
		
		return repo.findByCostIn(cost);
	}

	@Override
	public List<Vaccine> findByCostBetween(Double StartingCost,Double endingCost) {
		
		return repo.findByCostBetween(StartingCost,endingCost);
	}

	@Override
	public List<Vaccine> findByVaccineNameStartingWith(String name) {
		
		return repo.findByVaccineNameStartingWith(name);
	}

	@Override
	public List<Vaccine> findByVaccineNameInAndCostBetween(Iterable<String> vaccineNames,Double StartingCost,Double endingCost) {
		
		return repo.findByVaccineNameInAndCostBetween(vaccineNames,StartingCost, endingCost);
	}

	
	

	

	
	
	

}
