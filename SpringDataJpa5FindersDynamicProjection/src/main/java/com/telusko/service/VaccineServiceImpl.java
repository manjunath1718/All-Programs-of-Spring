package com.telusko.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.dao.IVaccineRepo;
import com.telusko.view.View;

@Service
public class VaccineServiceImpl implements IVaccineService {

	@Autowired
	IVaccineRepo repo;

	@Override
	public <T extends View>List<T> findByCostLessThan(Double cost,Class<T> cls) {
		
		return repo.findByCostLessThan(cost,cls);
	}

	

	
	

	

	
	
	

}
