package com.telusko.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer> {

}
