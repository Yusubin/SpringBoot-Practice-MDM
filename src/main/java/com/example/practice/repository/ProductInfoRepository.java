package com.example.practice.repository;

import com.example.practice.entity.ProductInfoEntity;
import com.example.practice.entity.SalaryInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductInfoRepository extends JpaRepository<ProductInfoEntity,String> {
    Optional<ProductInfoEntity> findByProductId(String productId);
}
