package com.telusko.beans;

public class Employee {
	
	private Integer id;
	private String name;
	private Integer age;
	private Department depart;
	
	public Employee() {
		super();
		System.out.println("Employee Bean created");
	}
	public Employee(Integer id, String name, Integer age, Department depart) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.depart = depart;
		System.out.println("Employee Bean created with parameterized constructor");
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
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Department getDepart() {
		return depart;
	}
	public void setDepart(Department depart) {
		this.depart = depart;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", depart=" + depart + "]";
	}
	
	
	
	

}
