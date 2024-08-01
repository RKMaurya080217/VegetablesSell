package com.VegetablesSell.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.VegetablesSell.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	 User findByUserId(Long userId);
}