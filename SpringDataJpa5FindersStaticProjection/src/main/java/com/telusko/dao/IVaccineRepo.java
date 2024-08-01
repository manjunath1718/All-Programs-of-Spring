package com.telusko.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.telusko.view.ResultView;

public interface IVaccineRepo extends JpaRepository<Vaccine, Integer> {

	public List<ResultView> findByCostLessThan(Double cost);
	
	
}
