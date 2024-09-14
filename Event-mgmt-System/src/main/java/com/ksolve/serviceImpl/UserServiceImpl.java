package com.ksolve.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ksolve.entity.Users;
import com.ksolve.repository.UserRepository;
import com.ksolve.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public Users saveUser(Users user) {
		return userRepository.save(user);
	}

	@Override
	public Optional<Users> getUserById(Long id) {
		return userRepository.findById(id);
	}

	@Override
	public List<Users> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}
}
