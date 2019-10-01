package com.example.cursospringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cursospringboot.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
