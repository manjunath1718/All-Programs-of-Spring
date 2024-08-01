package com.telusko.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.telusko.dao.Vaccine;

public interface IVaccineService {
	
	public Iterable<Vaccine> fetchDetailsSortBy(Boolean status,String...properties);

	public Iterable<Vaccine> fetchDetailsOfPageBySize(int pgNo,int pgSize,boolean status,String...properties );

	public List<Page<Vaccine>> fetchDetailsOfAllPages(int pgSize);
}
