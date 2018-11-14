package com.drivas.repositories;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.drivas.domain.Product;

public interface ProductRepository extends MongoRepository<Product, String>{
	
	Page<Product> findByDescriptionLike(String description, Pageable pageable);

}
