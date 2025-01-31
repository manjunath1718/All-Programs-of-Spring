package com.telusko.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.telusko.model.Customer;
import com.telusko.service.ICustomerService;

@Controller
public class CustomerController {

	ICustomerService service;
	
	@Autowired
	public void setService(ICustomerService service) {
		this.service = service;
	}

	@GetMapping("/getCx")
	public String getAllCx(Model model) {
		
		model.addAttribute("customers", service.getAllCx());
		
		return "customerlist";
	}
	
	@GetMapping("/showForm")
	public String showForm(@ModelAttribute Customer customer){
		
		return "showform";
	}
	
	@PostMapping("/registerCustomer")
	public String registerCustomer(@ModelAttribute Customer customer){
		
		service.registerCustomer(customer);
		return "redirect:/getCx";
	}
	
	@GetMapping("/updateForm")
	public String updateForm(@ModelAttribute("customer") Customer customer){
			
		System.out.println(" Customer Id ===> "+customer.getId());
		return "showform";
	}
	
	
	@GetMapping("/deleteData")
	public String deleteCustomerById(@RequestParam("id") Integer id){
		
		service.deleteCustomer(id);
		return "redirect:/getCx";
	}
	
	
	
	
}

