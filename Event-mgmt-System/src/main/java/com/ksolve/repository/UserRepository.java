package com.ksolve.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ksolve.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
	// Custom query methods (if needed) can be defined here
}
