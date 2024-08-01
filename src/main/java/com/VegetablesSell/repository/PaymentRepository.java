package com.VegetablesSell.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.VegetablesSell.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
