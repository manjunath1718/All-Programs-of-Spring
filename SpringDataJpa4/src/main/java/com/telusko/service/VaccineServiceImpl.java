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
	public Iterable<Vaccine> searchByGivenVaccineInfo(Vaccine vacc,boolean status,String...properties ) {
		
		
		Example<Vaccine> example = Example.of(vacc);
		Sort sort=Sort.by(status?Direction.ASC:Direction.DESC,properties);
		return repo.findAll(example,sort);
	}

	@Override
	public Vaccine searchVaccineById(Integer id) {
//		return repo.getById(id);//depricated
		return repo.getReferenceById(id);
	}

	@Override
	public List<Vaccine> searchVaccineByObject(Vaccine vaccine) {
		
		Example<Vaccine> example = Example.of(vaccine);
		return  repo.findAll(example);
	}

	@Override
	public String removeVaccinesByIds(List<Integer> ids) {
		
		List<Vaccine> list=repo.findAllById(ids);
		if(list.size()!=0) {
			
			repo.deleteAllByIdInBatch(ids);
			return "Records Deleted with given ids";			
		}
		
		return "Failed to Delete Records";		 
	}

	

	

	
	
	

}
