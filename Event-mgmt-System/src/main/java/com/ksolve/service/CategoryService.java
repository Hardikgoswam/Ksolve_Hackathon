package com.ksolve.service;

import java.util.List;
import java.util.Optional;

import com.ksolve.entity.Category;

public interface CategoryService {
	Category saveCategory(Category category);

	Optional<Category> getCategoryById(Long id);

	List<Category> getAllCategories();

	void deleteCategory(Long id);
	// Additional custom methods as needed
}
