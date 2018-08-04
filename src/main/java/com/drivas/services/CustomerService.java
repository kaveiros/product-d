package com.drivas.services;

import java.util.List;

import com.drivas.domain.Customer;

public interface CustomerService {
	
	List<Customer> listAllCustomers();
	
	Customer getCustomerById(Integer id);
	
	Customer saveOrUpateCustomer(Customer customer);
	
	void deleteCustomer(Integer id);
	

}
