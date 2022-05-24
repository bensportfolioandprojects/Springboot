package com.qa.SpringbootEx.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.SpringbootEx.Domain.User;
import com.qa.SpringbootEx.services.UserService;

@RestController
public class UserController {
	
	private UserService service;
	
	public UserController(UserService service) {
		this.service = service;
	}
	
	//	Read - Get Request
	@GetMapping("/getAll")
	public List<User> getAll() {
		return service.getAll();
	
	}
	
	//	Read All
	@GetMapping("/getById/{id}")
	public User getById(@PathVariable long id) {
		return service.getById(id);
		
	}
	
	//	Create - Post
	@PostMapping("/create")
	public User create (@RequestBody User user) {
		return service.create(user);
		
    }
	
	//	Update - Put/Patch
	@PutMapping("/update/{id}")
	public User update(@PathVariable long id, @RequestBody User user) {
		return service.update(id, user);
	}
	
	
	//	Delete - Delete Request
	@DeleteMapping("/delete/{id}")
	public User delete(@PathVariable long id) {
		return service.delete(id);
	}
	

}

