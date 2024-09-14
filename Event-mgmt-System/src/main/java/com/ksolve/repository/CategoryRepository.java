package com.ksolve.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ksolve.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
	// Custom query methods (if needed) can be defined here
}
