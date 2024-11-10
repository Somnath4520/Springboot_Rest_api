package com.spring.restapi;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.restapi.binding.Customer;

@RestController
public class CustomerController {

	
	@GetMapping(value = "/customer", produces = { MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public Customer getCustomer() {
		Customer c = new Customer();
		c.setName("John");
		c.setEmail("john@gmail.com");
		c.setGender("Male");
		return c;
	}
	
	@PostMapping(value = "/customer",
				 consumes = {"application/json","application/xml"},
				 produces = {"text/plain"})
	public ResponseEntity<String>createCustomer(@RequestBody Customer customer){
		System.out.println(customer);
		return new ResponseEntity<>("customer saved",HttpStatus.CREATED);
	}
}
