package com.telusko.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class QueryParamController {

	@GetMapping("/getmsg")//localhost:8484/getmsg?name=raj&course=spring
	public String getSomeMsg(@RequestParam("name") String n,String course,Map<String,Object> map){
		
		map.put("msg", "hi "+n+" I hope you're enjoying journy of learning "+course);
		return "index";
	}
}
