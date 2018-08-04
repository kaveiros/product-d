package com.drivas.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.drivas.domain.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	private Map<Integer, Customer> customers;
	
	public CustomerServiceImpl() {
		loadCustomers();
	}
	
	private void loadCustomers() {
		
		Customer customer1 = new Customer();
		customer1.setAddressLineOne("Olympiados 117 Athens");
		customer1.setAddressLineTwo("");
		customer1.setCity("Athens");
		customer1.setEmail("customer1@mail.com");
		customer1.setFirstName("Nikos");
		customer1.setLastName("Chant");
		customer1.setId(1);
		customer1.setPhoneNumber("121315");
		customer1.setState("Greece");
		customer1.setZipCode("38222");
		customers.put(1, customer1);
		
		Customer customer2 = new Customer();
		customer2.setAddressLineOne("Olympiados 117 Athens");
		customer2.setAddressLineTwo("");
		customer2.setCity("Athens");
		customer2.setEmail("customer1@mail.com");
		customer2.setFirstName("Nikos");
		customer2.setLastName("Chant");
		customer2.setId(1);
		customer2.setPhoneNumber("121315");
		customer2.setState("Greece");
		customer2.setZipCode("38222");
		customers.put(2, customer2);
		
		
		Customer customer3 = new Customer();
		customer3.setAddressLineOne("Olympiados 117 Athens");
		customer3.setAddressLineTwo("");
		customer3.setCity("Athens");
		customer3.setEmail("customer1@mail.com");
		customer3.setFirstName("Nikos");
		customer3.setLastName("Chant");
		customer3.setId(1);
		customer3.setPhoneNumber("121315");
		customer3.setState("Greece");
		customer3.setZipCode("38222");
		customers.put(3, customer3);
		
		Customer customer4 = new Customer();
		customer4.setAddressLineOne("Olympiados 117 Athens");
		customer4.setAddressLineTwo("");
		customer4.setCity("Athens");
		customer4.setEmail("customer1@mail.com");
		customer4.setFirstName("Nikos");
		customer4.setLastName("Chant");
		customer4.setId(1);
		customer4.setPhoneNumber("121315");
		customer4.setState("Greece");
		customer4.setZipCode("38222");
		customers.put(4, customer4);
		
		Customer customer5 = new Customer();
		customer5.setAddressLineOne("Olympiados 117 Athens");
		customer5.setAddressLineTwo("");
		customer5.setCity("Athens");
		customer5.setEmail("customer1@mail.com");
		customer5.setFirstName("Nikos");
		customer5.setLastName("Chant");
		customer5.setId(1);
		customer5.setPhoneNumber("121315");
		customer5.setState("Greece");
		customer5.setZipCode("38222");
		customers.put(5, customer5);
	}

	@Override
	public List<Customer> listAllCustomers() {
		
		return new ArrayList<>(customers.values());
		
	}

	@Override
	public Customer getCustomerById(Integer id) {
		
		return customers.get(id);
		
	}

	@Override
	public Customer saveOrUpateCustomer(Customer customer) {
		

		if(customer != null) {
			if (customer.getId() == null) {
				customer.setId(getNextCustomerKey());
			}
			
			customers.put(customer.getId(), customer);
			return customer;
		}
		else {
			throw new RuntimeException("Customer cannot be null");
		}

	}
	
	private Integer getNextCustomerKey() {
		
		return Collections.max(customers.keySet()) + 1;
	}

	@Override
	public void deleteCustomer(Integer id) {
		
		customers.remove(id);
		
	}

}
