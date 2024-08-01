package com.VegetablesSell.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Deliveries")
public class Delivery {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long deliveryId;

	@OneToOne
	@JoinColumn(name = "order_id",nullable = false)
	private Order order;

	@Column(nullable = false)
	private String deliveryAddress;
	@Column(nullable = false)
	private String deliveryStatus;
	@Column(nullable = false)
	private String trackingNumber;
	@Column(nullable = false)
	private Date deliveryDate;

	// Getters and Setters

	public Long getDeliveryId() {
		return deliveryId;
	}

	public void setDeliveryId(Long deliveryId) {
		this.deliveryId = deliveryId;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public String getDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public String getTrackingNumber() {
		return trackingNumber;
	}

	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public Delivery(Long deliveryId, Order order, String deliveryAddress, String deliveryStatus, String trackingNumber,
			Date deliveryDate) {
		super();
		this.deliveryId = deliveryId;
		this.order = order;
		this.deliveryAddress = deliveryAddress;
		this.deliveryStatus = deliveryStatus;
		this.trackingNumber = trackingNumber;
		this.deliveryDate = deliveryDate;
	}

	public Delivery() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}