package com.jobiak.imd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.jobiak.imd.model.Customer;
import com.jobiak.imd.repository.CustomerRepo;

@Controller
public class CustomerController {

	
	@Autowired
	CustomerRepo repo;

	public CustomerController() {
		super();
	}
	public CustomerController(CustomerRepo repo) {
		super();
		this.repo = repo;
	}
	
	@RequestMapping(path="/test1",method=RequestMethod.GET)
	public String redirect() {
		return "customerform";
	}
	@RequestMapping(path="/customerform",method=RequestMethod.POST)
	public String doBank(@ModelAttribute("customer")Customer customer) {
	 repo.save(customer); 
		return "customerview";
	}
}