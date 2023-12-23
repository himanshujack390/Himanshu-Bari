package com.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.entity.customerEntity;
import com.customer.repository.customerRepository;

@Service
public class customerService {
	@Autowired
	customerRepository customerrepository;
	
	public customerEntity save(customerEntity customer) {
		return customerrepository.save(customer);
	}
	
	public customerEntity getCustomer(int id) {
		return customerrepository.findById(id).get();
	}
	
	public customerEntity update(int id,customerEntity customer) {
		customerEntity cust = customerrepository.findById(id).get();
		cust.setId(customer.getId());
		cust.setName(customer.getName());
		cust.setOrder_id(customer.getOrder_id());
		cust.setPhone_no(customer.getPhone_no());
		cust.setEmail(customer.getEmail());
		return customerrepository.save(cust);
		}
	
	public String delete(int id) {
		customerrepository.deleteById(id);
		return "deleted " + id;
		
	}
	public List<customerEntity> getEmptyList(){
		return customerrepository.findAll();	
   }

	public customerRepository getCustomerrepository() {
		return customerrepository;
	}

	public void setCustomerrepository(customerRepository customerrepository) {
		this.customerrepository = customerrepository;
	}
}


