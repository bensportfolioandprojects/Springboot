package com.qa.SpringbootEx.services;

import java.util.List;
import org.springframework.stereotype.Service;
import com.qa.SpringbootEx.Domain.User;
import com.qa.SpringbootEx.exceptions.UserNotFoundExceptions;
import com.qa.SpringbootEx.exceptions.UserNotFoundExceptionWithID;
import com.qa.SpringbootEx.repo.UserRepo;

@Service
public class UserService {
	
	private UserRepo repo;
	
	public UserService(UserRepo repo) {
		this.repo = repo;
	}
		
//	Create
	public User create(User user) {
		return repo.saveAndFlush(user);
	}
	
//	Read all
	public List<User> getAll() {
		return repo.findAll();	
		}
//	Read by ID
	public User getById(long id) {
//		return repo.findById(id).orElseThrow(UserNotFoundExceptions::new);
		return repo.findById(id).orElseThrow(() -> new UserNotFoundExceptionWithID(id));
	}
//	Read by First Name
	public List<User> getByFirstName(String name) {
		return repo.findByFirstName(name);	
	}
//	Read by Last Name
	public List<User> getByLastName(String name) {
		return repo.findByLastName(name);		
	}
//	Read by First Name Starting With
	public List<User> getByFirstNameStartingWith(String name) {
		return repo.findByFirstNameStartingWith(name);		
	}
		
//	Update
	public User update(long id, User user) {
		User existing = repo.findById(id).get();
		existing.setFirstName(user.getFirstName());
		existing.setLastName(user.getLastName());
		existing.setUsername(user.getUsername());
		
		return repo.saveAndFlush(existing);
	}
//	Delete
	public boolean delete(long id) {
			repo.deleteById(id);
			return !repo.existsById(id);
	}	
}
