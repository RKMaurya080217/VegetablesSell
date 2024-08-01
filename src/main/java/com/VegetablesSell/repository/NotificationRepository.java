package com.VegetablesSell.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.VegetablesSell.entity.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}