package com.VegetablesSell.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.VegetablesSell.entity.Delivery;
import com.VegetablesSell.entity.Order;
import com.VegetablesSell.service.DeliveryService;
import com.VegetablesSell.service.OrderService;
import com.VegetablesSell.service.ProductService;
import com.VegetablesSell.service.UserService;

@RestController
@RequestMapping("/deliveries")
public class DeliveryController {

    @Autowired
    private DeliveryService deliveryService;
    
    @Autowired
    private OrderService orderService;

    @PostMapping
    public ResponseEntity<Delivery> addDelivery(@RequestBody Delivery delivery) {
    	
    	Order order = orderService.getOrderById(delivery.getOrder().getOrderId());
    	delivery.setOrder(order);
        return ResponseEntity.ok(deliveryService.addDelivery(delivery));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Delivery> getDelivery(@PathVariable Long id) {
        return deliveryService.getDelivery(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<Delivery>> getAllDeliveries() {
        return ResponseEntity.ok(deliveryService.getAllDeliveries());
    }

    @PutMapping
    public ResponseEntity<Delivery> updateDelivery(@RequestBody Delivery delivery) {
        return ResponseEntity.ok(deliveryService.updateDelivery(delivery));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDelivery(@PathVariable Long id) {
        deliveryService.deleteDelivery(id);
        return ResponseEntity.noContent().build();
    }
}