package com.telusko.service;

import com.telusko.model.Tourist;

public interface IGreetingService {

	public String greet();
	public boolean acceptTourist(Tourist tourist);
}
