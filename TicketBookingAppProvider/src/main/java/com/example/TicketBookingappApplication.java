package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Ticket Booking App",version = "1.0",
                                description = "This API is to book Ticket"),
                   servers = @Server(url = "http://localhost:8484/TicketBookingApp",
                                     description = "This is Server where our Application deployed")
                  )
public class TicketBookingappApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketBookingappApplication.class, args);
	}

}
