package com.drivas.services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.drivas.domain.Product;
import com.drivas.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	
	@Autowired
	ProductRepository prodRepo;	
	
	
	@Override
	public Product getProductById(String id) {
		return prodRepo.findOne(id);
	}

	@Override
	public Product saveOrUpdateProduct(Product product) {

		if (product != null) { 
			
			if (product.getId() == null) {
				//product.setId(getNextKey());
			}
			
			//products.put(product.getId(), product);
			return product;
		}
		else {
			throw new RuntimeException("Product cannot be null");
		}
	}

	@Override
	public void deleteProduct(String id) {
		prodRepo.delete(id);
		
	}


	@Override
	public Page<Product> listAllProducts(Pageable page) {
		return prodRepo.findAll(page);
	}


	@Override
	public Page<Product> findByDescription() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
