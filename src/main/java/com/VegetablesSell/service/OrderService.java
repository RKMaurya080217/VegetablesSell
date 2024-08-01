package com.VegetablesSell.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.VegetablesSell.entity.Order;
import com.VegetablesSell.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;

	public Order getOrderById(Long orderId) {
		return orderRepository.findByOrderId(orderId);
	}

	public Order addOrder(Order order) {
		return orderRepository.save(order);
	}

	public Optional<Order> getOrder(Long orderId) {
		return orderRepository.findById(orderId);
	}

	public List<Order> getAllOrders() {
		return orderRepository.findAll();
	}

	public Order updateOrder(Order order) {
		return orderRepository.save(order);
	}

	public void deleteOrder(Long orderId) {
		orderRepository.deleteById(orderId);
	}

}