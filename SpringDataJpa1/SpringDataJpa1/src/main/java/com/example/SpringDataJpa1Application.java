package com.example;

import java.util.Iterator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.dao.IStudentRepo;
import com.example.dao.Student;

@SpringBootApplication
public class SpringDataJpa1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpa1Application.class, args);
	
		IStudentRepo dao = container.getBean(IStudentRepo.class);
	    System.out.println("Implementaion class of IStudentRepo ==>"+dao.getClass().getName());
//		Student std=dao.save(new Student(3,"karthik","Hibernate"));
//		System.out.println(std);
	
//	    dao.deleteById(6);
//		System.out.println("Deleted record with id 6");
	    
	    
	    System.out.println(dao.count());//--> number of records in the table
		

		
//		Iterable<Student> records = dao.findAll();
//		Iterator<Student> iterator = records.iterator();
//		while(iterator.hasNext()){
//			
//			Student s=iterator.next();
//			System.out.println(s);
//		}
		
	    dao.findAll().forEach(s->System.out.println(s));
		
		Integer id=3;
		Boolean status=dao.existsById(id);
		System.out.println("Record with id "+id +" Present? ->"+ status);
		
		
		
	}

}
