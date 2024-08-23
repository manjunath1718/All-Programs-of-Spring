package com.telusko.service;

import java.util.List;

import com.telusko.model.Alien;

public interface IAlienService {

	public Alien registerAlien(Alien alien);
	public List<Alien> fetchAllAlien();
	public Alien fetchAlienById(Integer id);
}
