package com.telusko.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface IVaccineRepo extends JpaRepository<Vaccine, Integer> {

	//findByProperty
	public List<Vaccine> findByCost(Double cost);
//findByVaccineCompanyEquals()==findByVaccineCompanyIs==findByVaccineCompany
	public List<Vaccine> findByVaccineCompanyIs(String company);
	public List<Vaccine> findByCostLessThan(Double cost);
	public List<Vaccine> findByCostIn(Double... cost);
	public List<Vaccine> findByCostBetween(Double StartingCost,Double endingCost);

	public List<Vaccine> findByVaccineNameStartingWith(String name);

	public List<Vaccine> findByVaccineNameInAndCostBetween(Iterable<String> vaccineNames,Double StartingCost,Double endingCost);

	
}
