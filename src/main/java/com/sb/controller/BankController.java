package com.sb.controller;
import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {
	
	public List<String> location=new ArrayList<>();
	
	@GetMapping("/get-branch")
	public List<String> displayBranches(){
		location.add("Kolkata");
		location.add("Kolkata");
		location.add("Kolkata");
		location.add("Kolkata");
		location.add("Kolkata");
		location.add("Kolkata");
		location.add("Kolkata");
		location.add("Kolkata");
		location.add("Kolkata");
		location.add("Kolkata");
		return location;
	}
	
	public List<String> services(){
		List<String> services=new ArrayList<>();
		services.add("Credit");
		services.add("Debit");
		services.add("loan");
		services.add("Fixed Deposit");
		services.add("Recurring Deposit");
		return services;
	}
	

}
