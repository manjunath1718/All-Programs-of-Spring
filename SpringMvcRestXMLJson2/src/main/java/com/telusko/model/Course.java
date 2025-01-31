package com.telusko.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

//import jakarta.xml.bind.annotation.XmlRootElement;

//@XmlRootElement//we can use @XmlRootElement with diff dependencies in pom.xml
@JacksonXmlRootElement
public class Course {

	private Integer id;
	private String name;
	private Double price;
	
	public Course() {
		
	}
	public Course(Integer id, String name, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
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
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
}
