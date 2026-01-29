package com.example.practice.repository;

import com.example.practice.entity.PayRollEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PayrollRepository extends JpaRepository<PayRollEntity,String> {
    Optional<PayRollEntity> findBypayrollId(String payrollId);
}
