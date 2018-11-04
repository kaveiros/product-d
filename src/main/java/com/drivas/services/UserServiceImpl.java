package com.drivas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drivas.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepo;

	@Override
	public void login(String email) {
		
		if (userRepo.findByEmail(email) != null) {
			System.out.println("user Found!!");
		}
		
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		
	}

}
