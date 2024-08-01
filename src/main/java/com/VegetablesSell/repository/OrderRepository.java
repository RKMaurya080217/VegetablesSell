package com.VegetablesSell.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.VegetablesSell.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	public Order findByOrderId(Long orderId);
}