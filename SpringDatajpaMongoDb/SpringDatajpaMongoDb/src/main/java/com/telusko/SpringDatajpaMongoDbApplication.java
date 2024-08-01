package com.telusko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.dto.CustomerDto;
import com.telusko.idgenerator.IdGenerator;
import com.telusko.service.CustomerService;

@SpringBootApplication
public class SpringDatajpaMongoDbApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext container = SpringApplication.run(SpringDatajpaMongoDbApplication.class, args);
	
		CustomerService service=container.getBean(CustomerService.class);
	
		CustomerDto dto =new CustomerDto();
		dto.setId(IdGenerator.generateId());
		dto.setCxNo(105);
		dto.setName("joey");
		dto.setCity("newyork");
		String msg = service.registerCustomer(dto);
		System.out.println(msg);
			
		service.fetchAllCx().forEach(c->System.out.println(c));
	
//		String status = service.deleteCustomerInfoById("66a0e3c43716bf120fe1841c");
//	    System.out.println(status);
	
	}

}
