package com.qa.SpringbootEx.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.SpringbootEx.Domain.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long>{
	

}
