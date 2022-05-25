package com.qa.SpringbootEx.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.SpringbootEx.Domain.User;
import com.qa.SpringbootEx.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	private UserService service;
	
	public UserController(UserService service) {
		this.service = service;
	}
	
	//	Read - Get Request
	@GetMapping("/getAll")
	public ResponseEntity<List<User>> getAll() {
		return new ResponseEntity<List<User>>(service.getAll(), HttpStatus.OK);
	
	}
	
	//	Read All
	@GetMapping("/getById/{id}")
	public ResponseEntity<User> getById(@PathVariable long id) {
		return new ResponseEntity<User>(service.getById(id), HttpStatus.OK);
		
	}
//	Read from First Name
	@GetMapping("/getByFirstName/{name}")
	public ResponseEntity<List<User>> getByFirstName(@PathVariable String name) {
		return new ResponseEntity<List<User>>(service.getByFirstName(name), HttpStatus.OK);
	}
	
	//	Read from Last Name
	@GetMapping("/getByLastName/{name}")
	public ResponseEntity<List<User>> getByLastName(@PathVariable String name) {
		return new ResponseEntity<List<User>>(service.getByLastName(name), HttpStatus.OK);
	}
    //	Read from First Name Starting With
	@GetMapping("/getByFirstNameStartingWith/{name}")
	public ResponseEntity<List<User>> getByFirstNameStartingWith(@PathVariable String name) {
		return new ResponseEntity<List<User>>(service.getByFirstNameStartingWith(name), HttpStatus.OK);
	}
	
	//	Create - Post
	@PostMapping("/create")
	public ResponseEntity<User> create (@RequestBody User user) {
		return new ResponseEntity<User>(service.create(user), HttpStatus.CREATED);
    }
	
	//	Update - Put/Patch
	@PutMapping("/update/{id}")
	public ResponseEntity<User> update(@PathVariable long id, @RequestBody User user) {
		return new ResponseEntity<User>(service.update(id, user),HttpStatus.ACCEPTED);
	}
	
	
	//	Delete - Delete Request
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Boolean> delete(@PathVariable long id) {
		return service.delete(id) ? new ResponseEntity<>(HttpStatus.NO_CONTENT)
				: new ResponseEntity<Boolean>(HttpStatus.NOT_FOUND);
	}
}

