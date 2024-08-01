package com.telusko.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface IVaccineRepo extends JpaRepository<Vaccine, Integer> {

	@Query("FROM Vaccine where vaccineCompany=:c")
	public List<Vaccine> searchByVaccineCompanyName(@Param("c") String company);
	
	@Query("From Vaccine where vaccineCompany IN (:companyNames)")
	public List<Vaccine> searchByVaccineCompanyNames(String...companyNames);
	
	@Query("FROM Vaccine where cost BETWEEN  :minCost and :maxCost")
	public List<Vaccine> searchByVaccinePriceRange(Integer minCost,Integer maxCost);

	@Query("Select vaccineCompany,cost FROM Vaccine where vaccineName IN (:vac1,:vac2)")
	public List<String[]> searchVaccineInfoByVaccineName(String vac1,String vac2);
	
	@Transactional
	@Modifying
	@Query("UPDATE Vaccine SET cost=:newCost where vaccineName=:vaccName")
	public int updatePriceByVaccineName(String vaccName,Double newCost);
	
	@Transactional
	@Modifying
	@Query("DELETE Vaccine where cost between :minCost and :maxCost")
	public int deleteByVaccinePriceRange(Integer minCost,Integer maxCost);
	
	//NativeQuery
	@Transactional
	@Modifying
	@Query(value="INSERT into vaccine_info(id,vaccine_name,vaccine_company,cost) values (:id,:vaccineName,:vaccineCompany,:cost)",nativeQuery = true)
	public int insertVaccineDetails(Integer id,String vaccineName, String vaccineCompany, Double cost);
	
	

}
