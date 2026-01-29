package com.example.practice.service;

import com.example.practice.entity.OrderInfoEntity;
import com.example.practice.repository.OrderInfoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderInfoService {
    private final OrderInfoRepository repo;

    public OrderInfoService(OrderInfoRepository repo) {
        this.repo = repo;
    }


    public List<OrderInfoEntity> getAllViewList() {

        return repo.findAll();
    }

}
