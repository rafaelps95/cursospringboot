package com.example.cursospringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cursospringboot.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
