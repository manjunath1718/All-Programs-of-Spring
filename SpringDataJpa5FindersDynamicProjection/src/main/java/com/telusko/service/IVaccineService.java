package com.telusko.service;

import java.util.List;

import com.telusko.view.View;

public interface IVaccineService {
	
	public  <T extends View>List<T> findByCostLessThan(Double cost,Class<T> cls);
	
}
