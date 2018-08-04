package com.drivas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.drivas.domain.Product;
import com.drivas.services.ProductServiceImpl;

@Controller
public class ProductController {
	
	@Autowired
	 private ProductServiceImpl productService;
	
    
	
	@RequestMapping(value = "/products")
	public String listProducts(Model model) {
		
		model.addAttribute("products", productService.listAllProducts());
		return "products";
	}
	
	@RequestMapping("/product/{id}")
	public String getProdut(@PathVariable Integer id, Model model) {
		
		model.addAttribute("product", productService.getProductById(id));
		
		return "product";
	}
	
	@RequestMapping("/product/edit/{id}")
	public String editProduct(@PathVariable Integer id, Model model) {
		
		model.addAttribute("product", productService.getProductById(id));
		return "productform";
	}
	
	@RequestMapping("/product/new")
	public String newProduct(Model model) {
		model.addAttribute("product", new Product());
		return "productform";
	}

	@RequestMapping(value="/product", method = RequestMethod.POST)
	public String saveOrUpdateProduct(Product product) {
		
		Product savedProduct = productService.saveOrUpdateProduct(product);
		return "redirect:/product/" + savedProduct.getId();
	}
	
	@RequestMapping("/product/delete/{id}")
	public String deleteProduct(@PathVariable Integer id) {
		
		productService.deleteProduct(id);
		return "redirect:/products";
	}
}