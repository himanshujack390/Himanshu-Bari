package com.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.entity.customerEntity;
import com.customer.service.customerService;

@RestController
@RequestMapping("/customer")
public class customerController {
	@Autowired
	customerService customerservice;
	
	public customerService getCustomerservice() {
		return customerservice;
	}
	
	public void setCustomerservice(customerService customerservice) {
		this.customerservice = customerservice;
	}
	
	@PostMapping("/new")
	public customerEntity addCustomer(@RequestBody customerEntity customer){
		return customerservice.save(customer);
		
	}
	// http://localhost:8071/customers/2 -GET
	@GetMapping(path="/{id}")
	public customerEntity getcustomer(@PathVariable int id)
	{
	return customerservice.getCustomer(id); 
	}
	//http://localhost:8071/customers/id -PUT
	@PutMapping(path="/{id}") 
	public customerEntity updatecustomer(@RequestBody customerEntity customer,@PathVariable int id)
	{
	return customerservice.update(id,customer); 
	}
	//http://localhost:8071/customers/2 -DELETE
	@DeleteMapping(path="/{id}")
	public String deletecustomer(@PathVariable int id)
	{
	return customerservice.delete(id); 
	}
	//http://localhost:8071/customers GET
	@GetMapping
	public List<customerEntity> getAllcustomer()
	{
	return customerservice.getEmptyList();
	}
	
	

}
