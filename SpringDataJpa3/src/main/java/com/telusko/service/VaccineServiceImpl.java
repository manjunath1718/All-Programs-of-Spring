package com.telusko.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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
	public Iterable<Vaccine> fetchDetailsSortBy(Boolean status,String... properties) {
		
		Sort sort=Sort.by(status?Direction.ASC:Direction.DESC, properties);
		return repo.findAll(sort);
	}

	@Override
	public Iterable<Vaccine> fetchDetailsOfPageBySize(int pgNo,int pgSize,boolean status,String...properties ) {
		
//		Sort sort=Sort.by(status?Direction.ASC:Direction.DESC, properties);
//		PageRequest.of(pgNo,pgSize,sort);
		
		PageRequest pageable = PageRequest.of(pgNo, pgSize, status?Direction.ASC:Direction.DESC, properties);
		Page<Vaccine> page = repo.findAll(pageable);
		return page.getContent();
//		return page;
	}

	@Override
	public List<Page<Vaccine>> fetchDetailsOfAllPages(int pgSize) {
		
		long noOfRecordsInDataBase = repo.getVaccinesCount();
		
		long pages=noOfRecordsInDataBase/pgSize;
		
		pages=noOfRecordsInDataBase%pgSize==0?pages: ++pages;
		
		List<Page<Vaccine>> pagesContent=new ArrayList<>();
		for(int i=0;i<pages;i++) {
			PageRequest pageable = PageRequest.of(i, pgSize);
			Page<Vaccine> page = repo.findAll(pageable);
			pagesContent.add(page);
		}
		return pagesContent;
	}

	

	
	
	

}
