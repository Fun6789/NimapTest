package com.example.assignment.nimap.service;

import java.util.Optional;

import org.springframework.data.domain.Page;

import com.example.assignment.nimap.entity.Category;

public interface CategoryService {

	 public Page<Category> getAllCategories(int page, int size);
	 
	 public Category createCategory(Category category);
	 
	 public Optional<Category> getCategoryById(Long id);
	 
	 public Category updateCategory(Long id, Category updatedCategory);
	 
	 public void deleteCategory(Long id);
}
