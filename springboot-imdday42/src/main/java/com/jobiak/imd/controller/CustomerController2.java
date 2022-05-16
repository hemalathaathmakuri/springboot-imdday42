package com.jobiak.imd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.jobiak.imd.model.Customer2;
import com.jobiak.imd.repository.CustomerRepo2;

@Controller
public class CustomerController2 {

	
	@Autowired
	CustomerRepo2 repo;

	public CustomerController2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerController2(CustomerRepo2 repo) {
		super();
		this.repo = repo;
	}
	
	@RequestMapping(path="/test2",method=RequestMethod.GET)
	public String redirect() {
		return "signup";
	}
	@RequestMapping(path="/signup",method=RequestMethod.POST)
	public String doBank(@ModelAttribute("customer2")Customer2 customer2) {
	 repo.save(customer2); 
		return "success";
	}
}