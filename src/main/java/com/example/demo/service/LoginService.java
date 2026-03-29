package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Users;
import com.example.demo.repository.UsersRepository;

@Service
public class LoginService {
	
	private final UsersRepository repository;
	@Autowired
    private PasswordEncoder passwordEncoder;
	
	public LoginService(UsersRepository repository) {
        this.repository = repository;
    }

    public String save(Users entity) {
    	String encodedPassword = passwordEncoder.encode(entity.getPass());
    	entity.setPass(encodedPassword);
        repository.save(entity);
        return "Successfully registered";
    }

}
