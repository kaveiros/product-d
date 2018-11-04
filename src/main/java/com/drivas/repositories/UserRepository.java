package com.drivas.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.drivas.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, Integer> {
	
	public User findByEmail(String email);

}
