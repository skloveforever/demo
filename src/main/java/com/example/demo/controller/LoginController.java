package com.example.demo.controller;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Users;
import com.example.demo.service.LoginService;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	private final LoginService service;
	
	public LoginController(LoginService service) {
        this.service = service;
    }
	
    @PostMapping
    public String addData(@RequestBody Users entity) {
        service.save(entity);
        return "User successfully registered";
    }

//    @GetMapping
//    public List<Users> getAll() {
//        return service.getAll();
//    }

}
