package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Passenger;

public interface ITicketRepo extends JpaRepository<Passenger, Integer>{

}
