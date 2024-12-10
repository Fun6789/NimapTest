package com.example.assignment.nimap.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import com.example.assignment.nimap.entity.Product;

public interface ProductService {

	 public Page<Product> getAllProducts(int page, int size);
	 
	 public List<Product> createProduct(List<Product> product);
	 
	 public Optional<Product> getProductById(Long id);
	 
	 public Product updateProduct(Long id, Product updatedProduct);
	 
	 public void deleteProduct(Long id);
}
