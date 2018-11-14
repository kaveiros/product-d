package com.drivas.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.drivas.domain.Product;


public interface ProductService {

	Page<Product> listAllProducts(Pageable page);
	
	Page<Product> findByDescription();
	
	Product getProductById(String id);
	
	Product saveOrUpdateProduct(Product product);
	
	void deleteProduct(String id);
}
