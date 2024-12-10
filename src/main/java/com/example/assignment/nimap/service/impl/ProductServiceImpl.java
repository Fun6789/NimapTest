package com.example.assignment.nimap.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.assignment.nimap.entity.Product;
import com.example.assignment.nimap.repository.ProductRepository;
import com.example.assignment.nimap.service.ProductService;


@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
    private ProductRepository productRepository;

	public Page<Product> getAllProducts(Pageable pageable) {
        return productRepository.findAll(pageable);
    }
    
    
	@Override
	public List<Product> createProduct(List<Product> product) {
        return productRepository.saveAll(product);
    }

	@Override
	 public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    public Product updateProduct(Long id, Product updatedProduct) {
        return productRepository.findById(id)
                .map(product -> {
                    product.setName(updatedProduct.getName());
                    product.setPrice(updatedProduct.getPrice());
                    product.setCategory(updatedProduct.getCategory());
                    return productRepository.save(product);
                }).orElseThrow(() -> new RuntimeException("Product not found"));
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

}
