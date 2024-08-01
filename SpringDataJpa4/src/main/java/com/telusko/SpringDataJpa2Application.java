package com.telusko;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.dao.Vaccine;
import com.telusko.service.VaccineServiceImpl;

@SpringBootApplication
public class SpringDataJpa2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpa2Application.class, args);
		VaccineServiceImpl service = container.getBean(VaccineServiceImpl.class);
		

//		Vaccine vacc=new Vaccine("phizer", "USA");
//		service.searchByGivenVaccineInfo(vacc, true, "vaccineName","cost").
//		forEach(v->System.out.println(v.getVaccineName()+" : "+v.getVaccineCompany()+" : "+v.getCost()));
		
//	    System.out.println(service.searchVaccineById(53)); 
		
//		Vaccine vacc=new Vaccine("phizer", "USA");
//		service.searchVaccineByObject(vacc).forEach(v->System.out.println(v));
	
		String delMsg = service.removeVaccinesByIds(List.of(105, 106));
		System.out.println(delMsg);
	}

}
