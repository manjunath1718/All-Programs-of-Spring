package com.telusko.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="VaccineInfo")
public class Vaccine {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
	
	private String vaccineName;
	
	private String vaccineCompany;
	
	private Double cost;

	public Vaccine() {
		
	}

	public Vaccine(String vaccineName, String vaccineCompany, double cost) {
		super();
		this.vaccineName = vaccineName;
		this.vaccineCompany = vaccineCompany;
		this.cost = cost;
	}
	
	public Vaccine(String vaccineName, String vaccineCompany) {
		
		this.vaccineName = vaccineName;
		this.vaccineCompany = vaccineCompany;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVaccineName() {
		return vaccineName;
	}

	public void setVaccineName(String vaccineName) {
		this.vaccineName = vaccineName;
	}

	public String getVaccineCompany() {
		return vaccineCompany;
	}

	public void setVaccineCompany(String vaccineCompany) {
		this.vaccineCompany = vaccineCompany;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Vaccine [id=" + id + ", vaccineName=" + vaccineName + ", vaccineCompany=" + vaccineCompany + ", cost="
				+ cost + "]";
	}
	
	
	
	
}
