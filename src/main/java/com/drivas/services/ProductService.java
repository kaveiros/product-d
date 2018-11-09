package com.drivas.services;

import java.util.List;

import com.drivas.domain.Product;


public interface ProductService {

	List<Product> listAllProducts();
	
	Product getProductById(String id);
	
	Product saveOrUpdateProduct(Product product);
	
	void deleteProduct(String id);
}
