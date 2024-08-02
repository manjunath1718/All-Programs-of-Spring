package com.telusko.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.telusko.model.Course;

@Controller
public class CourseController {

	@GetMapping("/courseInfo")
	public String getCourse(Map<String,Object> map) {
		
		Course course=new Course(1, "DevOps", 5000.0);			
		map.put("course1", course);
		
		return "courseinfo";
	}
	
	@GetMapping("course2")
	public String getCourse2(Map<String,Object> map) {
		
		map.put("cid", 101);
		map.put("cname", "GoLang");
		map.put("cprice", 5000.0);
		
		return "course2";
	}
}
