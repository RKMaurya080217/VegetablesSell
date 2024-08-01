package com.VegetablesSell.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.VegetablesSell.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	Product findByProductId(Long productId);
}