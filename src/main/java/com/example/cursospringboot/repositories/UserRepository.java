package com.example.cursospringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cursospringboot.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
