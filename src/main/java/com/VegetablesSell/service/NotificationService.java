package com.VegetablesSell.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.VegetablesSell.entity.Notification;
import com.VegetablesSell.repository.NotificationRepository;

@Service
public class NotificationService {

    @Autowired
    private NotificationRepository notificationRepository;

    public Notification addNotification(Notification notification) {
        return notificationRepository.save(notification);
    }

    public Optional<Notification> getNotification(Long notificationId) {
        return notificationRepository.findById(notificationId);
    }

    public List<Notification> getAllNotifications() {
        return notificationRepository.findAll();
    }

    public Notification updateNotification(Notification notification) {
        return notificationRepository.save(notification);
    }

    public void deleteNotification(Long notificationId) {
        notificationRepository.deleteById(notificationId);
    }
}