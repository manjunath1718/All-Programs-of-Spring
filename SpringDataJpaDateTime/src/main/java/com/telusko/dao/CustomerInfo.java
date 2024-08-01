package com.telusko.dao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class CustomerInfo {

	@Id
	@GeneratedValue
	Integer id;
	String name;
	String city;
	LocalDateTime dob;
	LocalDate regDate;
	LocalTime regTime;
	String role;
	
	public CustomerInfo(String name, String city, LocalDateTime dob, LocalDate regDate, LocalTime regTime,
			String role) {
		super();
		this.name = name;
		this.city = city;
		this.dob = dob;
		this.regDate = regDate;
		this.regTime = regTime;
		this.role = role;
	}
	public CustomerInfo(String name, String city, LocalDateTime dob, LocalDate regDate, LocalTime regTime) {
		super();
		this.name = name;
		this.city = city;
		this.dob = dob;
		this.regDate = regDate;
		this.regTime = regTime;
	}
	public CustomerInfo() {
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public LocalDateTime getDob() {
		return dob;
	}
	public void setDob(LocalDateTime dob) {
		this.dob = dob;
	}
	public LocalDate getRegDate() {
		return regDate;
	}
	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}
	public LocalTime getRegTime() {
		return regTime;
	}
	public void setRegTime(LocalTime regTime) {
		this.regTime = regTime;
	}	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "CustomerInfo [id=" + id + ", name=" + name + ", city=" + city + ", dob=" + dob + ", regDate=" + regDate
				+ ", regTime=" + regTime + ", role=" + role + "]";
	}
	
	
	
	
	
}
