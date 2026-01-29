package com.example.practice.repository;

import com.example.practice.entity.SalaryInfoEntity;

import com.example.practice.entity.UserInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SalaryInfoRepository extends JpaRepository<SalaryInfoEntity, String> {
    Optional<SalaryInfoEntity> findBySalaryId(String SalaryId);
}
