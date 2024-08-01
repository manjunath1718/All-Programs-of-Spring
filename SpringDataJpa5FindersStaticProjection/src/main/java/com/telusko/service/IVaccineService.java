package com.telusko.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.telusko.dao.Vaccine;
import com.telusko.view.ResultView;

public interface IVaccineService {
	
	public List<ResultView> findByCostLessThan(Double cost);
	
}
