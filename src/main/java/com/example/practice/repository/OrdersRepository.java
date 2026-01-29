package com.example.practice.repository;

import com.example.practice.entity.OrdersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrdersRepository extends JpaRepository<OrdersEntity,String> {
    Optional<OrdersEntity> findByOrderItemId(String OrderItemId);
}
