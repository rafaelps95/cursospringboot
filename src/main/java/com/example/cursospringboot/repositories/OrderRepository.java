package com.example.cursospringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cursospringboot.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
