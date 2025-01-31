package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.reqres.Passenger;
import com.example.reqres.Ticket;
import com.example.service.IBookingTicketService;

@Controller
public class TicketBookingController {

	@Autowired
	IBookingTicketService service;
	
	@PostMapping("/book-ticket")
	public String bookTicket(@ModelAttribute Passenger passenger,Model model) {
		
		Ticket ticket = service.bookTicket(passenger);
		model.addAttribute("ticketNumber", ticket.getTicketNumber());
		return "index";		
	}
	
	@GetMapping("/form")
	public String getForm(Model model){
		
		model.addAttribute("passenger", new Passenger());
		return "index";
	}
	
	@GetMapping("/ticket")
	public String getTicketForm(Model model) {
		
		model.addAttribute("ticket", new Ticket());
		return "ticket-form";
	}
	
	@GetMapping("/get-ticket")
	public String getTicketDetails(@RequestParam("ticketNumber") Integer ticketNumber,Model model) {
		
		Ticket ticket = service.getTicketInfo(ticketNumber);
		model.addAttribute("ticket", ticket);
		return "ticket-info";
	}
	
	
	
	
}
