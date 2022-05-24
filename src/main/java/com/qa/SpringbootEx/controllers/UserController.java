package com.qa.SpringbootEx.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.SpringbootEx.Domain.User;

@RestController
public class UserController {
	
	private List<User> users = new ArrayList<>();

	
////	Read - Get Request
//	@GetMapping("/get")
//	public String hello() {
//		return "Hello";
//	}
	
//	Read - Get Request
	@GetMapping("/getAll")
	public List<User> getAll() {
		return users;
	}
	
//	Create - Post
	@PostMapping("/create")
	public User create (@RequestBody User user) {
		users.add(user);
		return users.get(users.size() -1);
    }
	
//	Update - Put/Patch
	
	
//	Delete - Delete Request
	

}

