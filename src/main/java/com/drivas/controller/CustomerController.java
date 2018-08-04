package com.drivas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.drivas.domain.Customer;
import com.drivas.services.CustomerServiceImpl;


@Controller
public class CustomerController {
	
	@Autowired
	private CustomerServiceImpl customerService;
	
	@RequestMapping(value = "/customers")
	public String listCustomers(Model model) {
		
		model.addAttribute("customers", customerService.listAllCustomers());
		return "customers";
		
	}
	
	
	@RequestMapping(value = "/customer/{id}")
	public String getCustomer(@PathVariable Integer id, Model model) {
		
		model.addAttribute("customer", customerService.getCustomerById(id));
		return "product";
		
	}
	
	@RequestMapping(value = "/customer/edit/{id}")
	public String editCustomer(@PathVariable Integer id, Model model) {
		
		model.addAttribute("customer", customerService.getCustomerById(id));
		return "productform";
		
	}
	
	@RequestMapping(value = "/customer/new")
	public String newCustomer(Model model) {
		model.addAttribute("customer", new Customer());
		return "customerform";
	}
	
	@RequestMapping(value="/customer", method = RequestMethod.POST)
	public String saveOrUpdateCustomer(Customer customer) {
		
		Customer savedCustomer = customerService.saveOrUpateCustomer(customer);
		return "redirect:/customer/" + savedCustomer.getId();
	}
	
	@RequestMapping("/customer/delete/{id}")
	public String deleteProduct(@PathVariable Integer id) {
		
		customerService.deleteCustomer(id);
		return "redirect:/products";
	}
}
