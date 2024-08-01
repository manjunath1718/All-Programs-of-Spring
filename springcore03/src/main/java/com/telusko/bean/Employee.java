package com.telusko.bean;

public class Employee {
	private Integer id;
	private String name;
	private Double salary;
	private String addr;
	
	static {
		System.out.println("Employee class Loaded");
	}
		
	public Employee() {
		super();
		System.out.println("non param constructor Bean is created");
	}
	
	public Employee(Integer id, String name, Double salary, String addr) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.addr = addr;
		System.out.println("param constructor Bean is created");
	}

	public String employeeTask() {
		return "Every Employee act Productive But in reality All of them are less productive";
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", addr=" + addr + "]";
	}
	
	
	

}
