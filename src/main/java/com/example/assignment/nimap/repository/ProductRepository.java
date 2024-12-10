package com.example.assignment.nimap.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.assignment.nimap.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
