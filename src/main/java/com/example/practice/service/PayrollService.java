package com.example.practice.service;

import com.example.practice.entity.OrderInfoEntity;
import com.example.practice.entity.PayRollEntity;
import com.example.practice.repository.PayrollRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PayrollService {
    private final PayrollRepository repo;

    public PayrollService(PayrollRepository repo) {
        this.repo = repo;
    }
    public List<PayRollEntity> getAllViewList() {

        return repo.findAll();
    }
}
