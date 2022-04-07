package com.example.gest_proy_invest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.gest_proy_invest.entity.User;
import com.example.gest_proy_invest.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository repository;
	
	@Override
	public Iterable<User> getAllUsers(){
		return repository.findAll();
	}

}
