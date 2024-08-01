package com.VegetablesSell.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Orders")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long orderId;

	@ManyToOne
	@JoinColumn(name = "product_id",nullable = false)
	private Product product;

	private int quantity;

	@ManyToOne
	@JoinColumn(name = "buyer_id",nullable = false)
	private User buyer;

	private Date orderDate;
	private String status;
	
	// Getters and Setters
	
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public User getBuyer() {
		return buyer;
	}
	public void setBuyer(User buyer) {
		this.buyer = buyer;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Order(Long orderId, Product product, int quantity, User buyer, Date orderDate, String status) {
		super();
		this.orderId = orderId;
		this.product = product;
		this.quantity = quantity;
		this.buyer = buyer;
		this.orderDate = orderDate;
		this.status = status;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
}