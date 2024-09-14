package com.ksolve.service;

import java.util.List;
import java.util.Optional;

import com.ksolve.entity.Users;

public interface UserService {
	Users saveUser(Users user);

	Optional<Users> getUserById(Long id);

	List<Users> getAllUsers();

	void deleteUser(Long id);
	// Additional custom methods as needed
}
