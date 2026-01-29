package com.example.practice.service;

import com.example.practice.entity.OrderInfoEntity;
import com.example.practice.entity.SalaryInfoEntity;
import com.example.practice.repository.SalaryInfoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SalaryInfoService {
    private final SalaryInfoRepository repo;

    public SalaryInfoService(SalaryInfoRepository repo) {
        this.repo = repo;
    }

    public List<SalaryInfoEntity> getAllViewList() {

        return repo.findAll();
    }
}
