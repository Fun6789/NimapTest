package com.example.assignment.nimap.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.assignment.nimap.entity.Category;
import com.example.assignment.nimap.entity.Product;
import com.example.assignment.nimap.repository.CategoryRepository;
import com.example.assignment.nimap.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
    private CategoryRepository categoryRepository;
	
	@Override
	 public Page<Category> getAllCategories(Pageable pageable){
        return categoryRepository.findAll(pageable);
    }

	@Override
	public Category createCategory(Category category) {
		 if (category.getProducts() != null) {
		        for (Product product : category.getProducts()) {
		            product.setCategory(category); // Set the category for each product
		        }
		    }
        return categoryRepository.save(category);
    }

	@Override
	public Optional<Category> getCategoryById(Long id) {
        return categoryRepository.findById(id);
    }

	@Override
	public Category updateCategory(Long id, Category updatedCategory) {
        return categoryRepository.findById(id)
                .map(category -> {
                    category.setName(updatedCategory.getName());
                    return categoryRepository.save(category);
                }).orElseThrow(() -> new RuntimeException("Category not found"));
    }


	@Override
	public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }


}
