package com.telusko.dao;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "customer")
public class CustomerInfo {

	@Id
	String id;
	Integer cxNo;
	String name;
	String city;
	
	public CustomerInfo(Integer cxNo, String name, String city) {
		super();
		this.cxNo = cxNo;
		this.name = name;
		this.city = city;
	}
	public CustomerInfo() {
		super();
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getCxNo() {
		return cxNo;
	}
	public void setCxNo(Integer cxNo) {
		this.cxNo = cxNo;
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
	@Override
	public String toString() {
		return "CustomerInfo [id=" + id + ", cxNo=" + cxNo + ", name=" + name + ", city=" + city + "]";
	}
	
	
}
