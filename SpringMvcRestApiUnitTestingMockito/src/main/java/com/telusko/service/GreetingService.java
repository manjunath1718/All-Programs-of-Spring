package com.telusko.service;

import java.time.LocalTime;

import org.springframework.stereotype.Service;

import com.telusko.model.Tourist;

@Service
public class GreetingService implements IGreetingService {

	@Override
	public String greet() {
		
		int hour=LocalTime.now().getHour();
		String wish=null;
		if(hour<12){
			
    		wish="Good Morning";
    	}
    	else if(hour<16){
    		
    		wish="Good Afternoon";
    	}
    	else if(hour<20){
    		
    		wish="Good Evening";
    	}
    	else{
    		wish="Good night";
    	}
		return wish;
	}

	@Override
	public boolean acceptTourist(Tourist tourist) {
		
		String msg="Tourist data stored in db";
		return true;
	}

}
