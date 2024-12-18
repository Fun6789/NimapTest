package com.example.assignment.nimap.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.assignment.nimap.entity.Category;

public interface CategoryService {

	 public Page<Category> getAllCategories(Pageable pageable);
	 
	 public Category createCategory(Category category);
	 
	 public Optional<Category> getCategoryById(Long id);
	 
	 public Category updateCategory(Long id, Category updatedCategory);
	 
	 public void deleteCategory(Long id);
}
