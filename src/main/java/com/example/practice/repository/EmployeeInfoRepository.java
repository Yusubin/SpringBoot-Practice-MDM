package com.example.practice.repository;

import com.example.practice.entity.EmployeeInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeInfoRepository extends JpaRepository<EmployeeInfoEntity,String> {
    Optional<EmployeeInfoEntity> findByEmployeeId(String EmployeeId);
}
