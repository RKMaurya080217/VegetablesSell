package com.VegetablesSell.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.VegetablesSell.entity.Delivery;

public interface DeliveryRepository extends JpaRepository<Delivery, Long> {
}