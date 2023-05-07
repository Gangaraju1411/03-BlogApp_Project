package com.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entity.UserRegistration;


public interface UserRegistrationRepo extends JpaRepository<UserRegistration,Integer> {

	
	public UserRegistration findByEmail(String Email);

	
	public UserRegistration findByEmailAndPassword(String email, String password);

	
}
