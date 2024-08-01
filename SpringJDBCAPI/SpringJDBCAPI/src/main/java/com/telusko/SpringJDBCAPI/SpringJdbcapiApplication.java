package com.telusko.SpringJDBCAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.SpringJDBCAPI.dao.EmployeeDaoImpl;

@SpringBootApplication
public class SpringJdbcapiApplication {

	public static void main(String[] args) {
		ApplicationContext container = SpringApplication.run(SpringJdbcapiApplication.class, args);
		EmployeeDaoImpl dao = container.getBean(EmployeeDaoImpl.class);
	
		dao.getEmployees().forEach(e->System.out.println(e));
		
	}

}
