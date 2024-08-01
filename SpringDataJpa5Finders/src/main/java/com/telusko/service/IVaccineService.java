package com.telusko.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.telusko.dao.Vaccine;

public interface IVaccineService {
	
	public List<Vaccine> findByCost(Double cost);
	public List<Vaccine> findByVaccineCompanyIs(String company);
	public List<Vaccine> findByCostLessThan(Double cost);
	public List<Vaccine> findByCostIn(Double... cost);
	public List<Vaccine> findByCostBetween(Double StartingCost,Double endingCost);

	public List<Vaccine> findByVaccineNameStartingWith(String name);
	public List<Vaccine> findByVaccineNameInAndCostBetween(Iterable<String> vaccineNames,Double StartingCost,Double endingCost);
	
}
