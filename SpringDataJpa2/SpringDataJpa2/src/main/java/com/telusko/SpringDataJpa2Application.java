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
//		service.registerVaccineInfo(new Vaccine("Covishield","Astrazenca" , 4545.6));
		
//		List<Vaccine> list=new ArrayList<>();
//		list.add(new Vaccine("Covaxin", "BharatBio", 1000));
//		list.add(new Vaccine("Phizer", "USA", 9994));
//		list.add(new Vaccine("Sputnik", "Russian", 45454));
//		
//		service.registerMultipleVaccines(list).forEach(v->System.out.println(v));
		
//		Long count=service.getVaccinesCount();
//		System.out.println("No of vaccines registered : "+ count);
		
//		Boolean status=service.checkAvailability(3);
//		if(status)
//			System.out.println("Vaccine Available");
//		else
//			System.out.println("Vaccine UnAvailable");
		
//		service.getAllVaccinesInfo().forEach(v->System.out.println(v));
//		List<Vaccine> vaccines=(List<Vaccine>) service.getAllVaccinesInfo();
//		Stream stream=vaccines.stream();
//		stream.forEach(v->System.out.println(v));
		
//		List<Integer> ids=new ArrayList<>();
//		ids.add(1);
//		ids.add(2);		
//		service.getAllVaccinesInfoOfSpecificIds(ids).forEach(v->System.out.println(v));
		
//		Optional<Vaccine> vacc = service.getVaccineById(2);
//		if(vacc.isPresent())
//			System.out.println(vacc);
//		else
//			System.out.println(vacc.orElse(new Vaccine()));
		
//		String msg = service.removeVaccineById(5);
//		System.out.println(msg);
		
//		String msg = service.removeVaccineByIds(List.of(105, 106));
//		System.out.println(msg);
		
		
//		Vaccine v=new Vaccine("Covaxin", "BharatBio",1000);
//		v.setId(2);
//		String msg = service.removeVaccineByVaccineObj(v);
//		System.out.println(msg);
		
		
		service.getVaccinesByCompany("BharatBio").
		forEach(v->System.out.println(v));
	}

}
