package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.ITouristRepo;
import com.example.exception.TouristNotFoundException;
import com.example.model.Tourist;

@Service
public class TouristServiceImpl implements ITouristService {

	@Autowired
	ITouristRepo repo;

	@Override
	public String registerTourist(Tourist tourist) {
		Integer id=repo.save(tourist).getId();
		return "Tourist Info saved  with an ID " + id;
	}

	@Override
	public List<Tourist> fetchAllTourists() {

		List<Tourist> list= repo.findAll();
//		Collections.shuffle(list);
		return list;
	}

	@Override
	public Tourist fetchTouristInfoById(Integer id)  {
		
		return repo.findById(id).
				orElseThrow(()->new TouristNotFoundException("Tourist with given id "+ id+ " is Not Found"));
	}

	@Override
	public String updateTouristInfo(Tourist tourist)  {
	
		Integer id=tourist.getId();
		Optional<Tourist> optional = repo.findById(id);
		if(optional.isPresent()){
			repo.save(tourist);
			return "Tourist info with id "+ id + " is updated" ;
		}
		else{
			throw new TouristNotFoundException("Tourist with given info is nout found to update");
		}

	}

	@Override
	public String updateTouristInfoById(Integer id, Double budget)  {
	
		Optional<Tourist> optional = repo.findById(id);
		if(optional.isPresent()){

			Tourist tourist = optional.get();
			tourist.setBudget(budget);
			repo.save(tourist);
			return "Tourist info with id "+ id + " is updated" ;

		}
		else{

			throw new TouristNotFoundException("Tourist with given info is nout found to update");
		}

	}


	@Override
	public String deleteTouristById(Integer id)  {

		Optional<Tourist> optional = repo.findById(id);
		if(optional.isPresent()) {
			repo.deleteById(id);
			return "Tourist Info with Id "+id+" deleted";
		}
		else {
			
			throw new TouristNotFoundException("Tourist Info with Id "+id+" Not Found");
		}
	}



}
