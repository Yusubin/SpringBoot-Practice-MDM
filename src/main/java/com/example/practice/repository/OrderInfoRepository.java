package com.example.practice.repository;

import com.example.practice.entity.OrderInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrderInfoRepository extends JpaRepository<OrderInfoEntity,String> {
    Optional<OrderInfoEntity> findByOrderId(String orderId);
}
