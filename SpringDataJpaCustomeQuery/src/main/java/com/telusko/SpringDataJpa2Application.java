package com.telusko;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.service.VaccineServiceImpl;

@SpringBootApplication
public class SpringDataJpa2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpa2Application.class, args);
		VaccineServiceImpl service = container.getBean(VaccineServiceImpl.class);
		
//		service.searchByVaccineCompanyName("Astrazenca").
//		forEach(v->System.out.println(v));

//		service.searchByVaccineCompanyNames("Astrazenca","BharatBio").
//		forEach(v->System.out.println(v));
		
//		service.searchByVaccinePriceRange(4000, 10000).
//		forEach(v->System.out.println(v));
		
//		service.searchVaccineInfoByVaccineName("Phizer", "covaxin").
//		forEach(v->System.out.println(v[0]+" : "+v[1]));
		
//		int rowsAffected = service.updatePriceByVaccineName("Phizer", 8888.8);
//		System.out.println("No if Rows Affected "+rowsAffected);
		
//		int rowsAffected = service.deleteByVaccinePriceRange(2000, 5000);
//		System.out.println("No if Rows Affected "+rowsAffected);
		
		int rowsAffected = service.insertVaccineDetails(1,"Covishield","Astrazenca" ,5000.0);
		System.out.println("No if Rows Affected "+rowsAffected);

	
	}

}
