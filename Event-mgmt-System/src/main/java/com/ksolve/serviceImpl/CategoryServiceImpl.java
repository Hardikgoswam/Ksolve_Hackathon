package com.ksolve.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ksolve.entity.Category;
import com.ksolve.repository.CategoryRepository;
import com.ksolve.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public Category saveCategory(Category category) {
		return categoryRepository.save(category);
	}

	@Override
	public Optional<Category> getCategoryById(Long id) {
		return categoryRepository.findById(id);
	}

	@Override
	public List<Category> getAllCategories() {
		return categoryRepository.findAll();
	}

	@Override
	public void deleteCategory(Long id) {
		categoryRepository.deleteById(id);
	}
}
