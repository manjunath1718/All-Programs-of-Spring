package com.telusko.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.dao.IVaccineRepo;
import com.telusko.dao.Vaccine;

@Service
public class VaccineServiceImpl implements IVaccineService {

	@Autowired
	IVaccineRepo repo;
	
	@Override
	public String registerVaccineInfo(Vaccine vaccineInfo) {
		
		 Vaccine vaccine = repo.save(vaccineInfo);		 
		return "Vaccine with id "+vaccine.getId()+" registered successfully";
	}

	@Override
	public Iterable<Vaccine> registerMultipleVaccines(Iterable<Vaccine> vaccines) {
		
		return repo.saveAll(vaccines);
	}

	@Override
	public Long getVaccinesCount() {
		
		return repo.count();
	}

	@Override
	public Boolean checkAvailability(Integer id) {
		
		return repo.existsById(id);
	}

	@Override
	public Iterable<Vaccine> getAllVaccinesInfo() {
		
		return repo.findAll();
	}

	@Override
	public Iterable<Vaccine> getAllVaccinesInfoOfSpecificIds(Iterable<Integer> ids) {
		
		return repo.findAllById(ids);
	}

	@Override
	public Optional<Vaccine> getVaccineById(Integer id) {
		
		return repo.findById(id);
	}

	@Override
	public String removeVaccineById(Integer id) {
//		Optional<Vaccine> optional = repo.findById(id);
//		if(optional.isPresent()) {
//			repo.deleteById(id);
//			return "Vaccine Details Deleted By Id "+id;
//		}
//		
//		return "Vaccine Details with given Id Not Found";
		
		if(repo.existsById(id)) {
			repo.deleteById(id);
			return "Vaccine Details Deleted By Id "+id;
		}
		return "Vaccine Details with given Id Not Found";
	}

	@Override
	public String removeVaccineByIds(List<Integer> ids) {
		List<Vaccine> vaccines = (List<Vaccine>) repo.findAllById(ids);
		if(vaccines.size()==ids.size()) {
			repo.deleteAllById(ids);
			return "Records of Given Ids Are DELETED";
		}
		
		return "Failed to DELETE Records";
	}

	@Override
	public String removeVaccineByVaccineObj(Vaccine obj) {
		
		Optional<Vaccine> optional = repo.findById(obj.getId());
		
		if(optional.isPresent()) {			
			repo.delete(obj);
			return "Vaccine Objects Deleted";
		}
		return "Failed to Delete Records";
		
	}

	@Override
	public Iterable<Vaccine> getVaccinesByCompany(String company) {
		
		return repo.findVaccineByVaccineCompany(company);
	}



}
