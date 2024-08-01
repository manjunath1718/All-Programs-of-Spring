package com.telusko.SpringDataJDBC.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SpringJdbc {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	private String SQL_QUERY="INSERT into student values (2,'virat','delhi')";

	private String SQL_QUERY_DELETE="DELETE from student where id=?";
	private String SQL_QUERY_Course="INSERT into course values (?,?)";
	
	public void insertStudentData() {

		System.out.println("JdbcTemplate "+jdbcTemplate.getClass().getName());
		System.out.println("Control is in insertStudentData");
		jdbcTemplate.update(SQL_QUERY);
	}
	
	public void delete(Integer id){
	
		System.out.println("Control is in delete");
		int rowAffected=jdbcTemplate.update(SQL_QUERY_DELETE, id);
		System.out.println("Rows deleted "+ rowAffected);
	}
	
	public void insertCourseDetails(CourseDetails course) {
		
		System.out.println("Control is in insert with course");		
		int row=jdbcTemplate.update(SQL_QUERY_Course, course.getCid(), course.getCname());
		System.out.println("Rows Affected ="+row);
	}
	
}
