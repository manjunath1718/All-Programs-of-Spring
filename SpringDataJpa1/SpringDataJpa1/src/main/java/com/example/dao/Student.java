package com.example.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	@Column(name="stdid")
	Integer id;
	
	@Column(name="stdname")
	String name;
	
	@Column(name="course")
	String course;

	
	public Student() {
		
	}


	public Student(Integer id, String name, String course) {
		
		this.id = id;
		this.name = name;
		this.course = course;
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


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + "]";
	}
	
	
}
