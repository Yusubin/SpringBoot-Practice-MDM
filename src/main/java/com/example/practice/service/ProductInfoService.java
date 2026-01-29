package com.example.practice.service;

import com.example.practice.entity.EmployeeInfoEntity;
import com.example.practice.entity.ProductInfoEntity;
import com.example.practice.repository.ProductInfoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductInfoService {
    private final ProductInfoRepository repo;

    public ProductInfoService(ProductInfoRepository repo) {
        this.repo = repo;
    }

    public List<ProductInfoEntity> getAllViewList() {

        return repo.findAll();
    }
}
