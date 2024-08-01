package com.telusko.dao;

import java.time.LocalDate;
import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class JobSeeker {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Integer id;
	String name;
	String city;
	LocalDate dob;
	@Lob
	@Column(length=100000)
	byte[] image;
	@Lob
	char[] textFile;
	
	public JobSeeker(String name, String city, LocalDate dob, byte[] image, char[] textFile) {
		super();
		this.name = name;
		this.city = city;
		this.dob = dob;
		this.image = image;
		this.textFile = textFile;
	}
	public JobSeeker() {
		
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
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public char[] getTextFile() {
		return textFile;
	}
	public void setTextFile(char[] textFile) {
		this.textFile = textFile;
	}
	@Override
	public String toString() {
		return "JobSeeker [id=" + id + ", name=" + name + ", city=" + city + ", dob=" + dob + ", image="
				+ Arrays.toString(image) + ", textFile=" + Arrays.toString(textFile) + "]";
	}
	
	
	
	
}
