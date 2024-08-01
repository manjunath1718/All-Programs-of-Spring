package com.telusko.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.telusko.dao.Vaccine;

public interface IVaccineService {

	 public String registerVaccineInfo(Vaccine vaccineInfo);
	 public Iterable<Vaccine> registerMultipleVaccines(Iterable<Vaccine> vaccines);

	 public Long getVaccinesCount();
     public Boolean checkAvailability(Integer id);
     public Iterable<Vaccine> getAllVaccinesInfo();
     public Iterable<Vaccine> getAllVaccinesInfoOfSpecificIds(Iterable<Integer> ids);

     public Optional<Vaccine> getVaccineById(Integer id);
     public String removeVaccineById(Integer id);
     public String removeVaccineByIds(List<Integer> ids);
     public String removeVaccineByVaccineObj(Vaccine obj);
     
     //Custom Query method
     public Iterable<Vaccine> getVaccinesByCompany(@Param("c") String company);
}
