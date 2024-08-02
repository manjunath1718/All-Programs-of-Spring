package com.telusko.service;

import java.time.LocalTime;

import org.springframework.stereotype.Service;

@Service
public class GreetingService implements IGreetingService {

	@Override
	public String generateGreetings() {

		int hour=LocalTime.now().getHour();
		if(hour<12) {
			return "GoodMorning";
		}
		else if(hour<16) {
			return "GoodAfternoon";
		}
		else if(hour<20) {
			return "GoodEvening";
		}else {
			return "Good Night";
		}

	}

}
