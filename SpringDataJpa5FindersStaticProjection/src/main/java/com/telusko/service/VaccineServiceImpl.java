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
import com.telusko.view.ResultView;

@Service
public class VaccineServiceImpl implements IVaccineService {

	@Autowired
	IVaccineRepo repo;

	

	@Override
	public List<ResultView> findByCostLessThan(Double cost) {
		
		return repo.findByCostLessThan(cost);
	}

	

	
	

	

	
	
	

}
