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
		
//		service.fetchDetailsSortBy(true, "vaccineName","vaccineCompany").
//		forEach(v->System.out.println(v.getVaccineName()+" : "+v.getVaccineCompany()));
		
//		service.fetchDetailsOfPageBySize(0, 2, true, "vaccineName","vaccineCompany").
//		forEach(v->System.out.println(v.getVaccineName()+" : "+v.getVaccineCompany()));

		service.fetchDetailsOfAllPages(4).
		forEach(v->{
			System.out.println("Page No==>"+v.getNumber());
			v.getContent().forEach(c->System.out.println(c));
		});
		
	
	
	}

}
