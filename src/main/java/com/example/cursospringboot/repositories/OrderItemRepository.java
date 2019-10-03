package com.example.cursospringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cursospringboot.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
