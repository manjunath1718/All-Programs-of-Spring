package com.telusko;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.dao.CustomerInfo;
import com.telusko.service.CustomerService;

@SpringBootApplication
public class SpringDataJpa2Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpa2Application.class, args);
	
		CustomerService service = container.getBean(CustomerService.class);
		
//		CustomerInfo cx=new CustomerInfo("rajesh","chennai"
//				,LocalDateTime.of(2001, 1, 15, 2, 22)
//				,LocalDate.of(2024, 06, 12),LocalTime.now(),"Dev");
//		
//		String msg = service.registerCustomer(cx);
//		System.out.println(msg);
		
		service.fetchAllCxInfo().forEach(c->System.out.println(c));

	}

}
