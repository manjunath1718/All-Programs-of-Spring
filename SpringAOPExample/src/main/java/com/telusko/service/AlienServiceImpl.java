package com.telusko.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.dao.AlienRepo;
import com.telusko.model.Alien;

@Service
public class AlienServiceImpl implements IAlienService {

	@Autowired
	AlienRepo repo;

	@Override
	public Alien registerAlien(Alien alien) {

		return repo.save(alien);
	}

	@Override
	public List<Alien> fetchAllAlien() {

		return repo.findAll();
	}

	@Override
	public Alien fetchAlienById(Integer id) {

		return repo.findById(id)
				.orElseThrow(()->new NoSuchElementException("Student not found with id " + id));
	}

}
