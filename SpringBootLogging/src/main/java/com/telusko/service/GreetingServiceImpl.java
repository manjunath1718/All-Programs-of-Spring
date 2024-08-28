package com.telusko.service;

import java.time.LocalTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements IGreetingService {

	static private final Logger logger=LoggerFactory.getLogger(GreetingServiceImpl.class);
	@Override
	public String generateGreetings() {
		
		logger.trace("control in service layer bussiness logic is been invocked");
		int hour=LocalTime.now().getHour();
		if(hour<12)
			return "Good Morning";
		else if(hour<16)
			return "Good AfterNoon";
		else if(hour<20)
			return "Good Evening";
		else
			return "Good Night";
		
	}

}
