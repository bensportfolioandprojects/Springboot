package com.qa.SpringbootEx.repo;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.qa.SpringbootEx.Domain.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long>{
	
//	Derived Query
	List<User> findByFirstName(String firstName);
	List<User> findByLastName(String lastName);
	List<User> findByFirstNameStartingWith(String name);
	
//	Manual SQL Query
	@Query(value = "SELECT * FROM user WHERE username = ?1", nativeQuery=true)
	Optional<User> findByUsername(String username);
	

	
	
	

}
