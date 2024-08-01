package com.telusko.SpringDataJDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.telusko.SpringDataJDBC.dao.CourseDetails;
import com.telusko.SpringDataJDBC.dao.SpringJdbc;

@Component
public class StudentCommandLineRunner implements CommandLineRunner {

	@Autowired
	SpringJdbc jdbc;
	
	@Override
	public void run(String... args) throws Exception {
		
		jdbc.insertStudentData();
//		jdbc.delete(2);
		
		jdbc.insertCourseDetails(new CourseDetails(1, "Java"));

	}

}
