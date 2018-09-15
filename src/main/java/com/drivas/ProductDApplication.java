package com.drivas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.drivas.domain.User;
import com.drivas.repositories.UsersRepository;

@SpringBootApplication
public class ProductDApplication implements CommandLineRunner{
	
	@Autowired
	UsersRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(ProductDApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user = new User();
		repo.save(user);
		
	}
}
