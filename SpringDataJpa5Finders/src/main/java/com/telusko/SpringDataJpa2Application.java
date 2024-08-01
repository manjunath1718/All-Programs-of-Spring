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
		
//		service.findByCost(45454.0).forEach(v->System.out.println(v));

//		service.findByVaccineCompanyIs("bharatBio").
//		forEach(v->System.out.println(v));

//		service.findByCostLessThan(10000.0).
//		forEach(v->System.out.println(v));
		
//		service.findByCostIn(45454.0,9994.0).
//		forEach(v->System.out.println(v));
				
//		service.findByCostBetween(1000.0,9995.0).
//		forEach(v->System.out.println(v));
		
//		service.findByVaccineNameStartingWith("Cov").
//		forEach(v->System.out.println(v));
		
		service.findByVaccineNameInAndCostBetween(List.of("phizer","covaxin"),1000.0,9994.0).
		forEach(v->System.out.println(v));
		
	}

}
