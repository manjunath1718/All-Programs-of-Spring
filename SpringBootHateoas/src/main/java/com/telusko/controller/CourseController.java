package com.telusko.controller;

import java.util.List;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.telusko.model.Course;

@Controller
@RequestMapping("/api")
public class CourseController {

	@GetMapping("/courseInfo/{id}")
	public ResponseEntity<Course> getCourse(@PathVariable("id")Integer id) {

		Course course=new Course(101, "DevOps", 5000.0);			

		return new ResponseEntity<Course>(course,HttpStatus.OK);
	}

	@GetMapping("getAllCourses")
	public ResponseEntity<List<Course>> getAllCourse() {

		Course c1=new Course(101, "Spring", 5000.0);
		Course c2=new Course(102, "Microservices", 4000.0);
		Course c3=new Course(103, "DevOps", 3000.0);
		List<Course> courses=List.of(c1, c2,c3);

		return new ResponseEntity<>(courses,HttpStatus.OK);
	}

	@GetMapping("/corejava/{id}")
	public ResponseEntity<Course> getJavaCourse(@PathVariable("id")Integer id) {

		Course course=new Course(101, "CoreJava", 2000.0);

		Link link=WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(CourseController.class)
				.getAllCourse()).withRel("/getAllCourses");
		course.add(link);
		
		return new ResponseEntity<Course>(course,HttpStatus.OK);
	}
}
