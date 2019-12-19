package com.food.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.food.model.Users;

public interface UserService extends JpaRepository<Users, Integer> {
}
