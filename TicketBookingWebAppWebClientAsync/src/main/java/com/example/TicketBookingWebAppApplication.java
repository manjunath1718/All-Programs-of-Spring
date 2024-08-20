package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.reqres.Ticket;

@SpringBootApplication
public class TicketBookingWebAppApplication {

	private static String GET_URL = 
			"http://localhost:8484/TicketBookingApp/provider/api/getTicket/{ticketNumber}";

	public static void main(String[] args) {
		SpringApplication.run(TicketBookingWebAppApplication.class, args);

		System.out.println("Request to api started...");
		WebClient webClient = WebClient.create();

		webClient.get()
		.uri(GET_URL, 444)
		.retrieve()
		.bodyToMono(String.class).subscribe(TicketBookingWebAppApplication::handleResponse);
		//.block();

		//System.out.println(ticket);

		System.out.println("Request to api ended...");

	}

	public static void handleResponse(String ticket) {

		System.out.println(ticket);
	}

}
