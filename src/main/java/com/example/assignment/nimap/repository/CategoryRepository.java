package com.example.assignment.nimap.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.assignment.nimap.entity.Category;

public interface CategoryRepository  extends JpaRepository<Category, Long>{

}
