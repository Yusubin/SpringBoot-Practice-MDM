package com.example.practice.service;

import com.example.practice.entity.OrderInfoEntity;
import com.example.practice.entity.OrdersEntity;
import com.example.practice.repository.OrderInfoRepository;
import com.example.practice.repository.OrdersRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderService {

    final private OrdersRepository repo;

    public OrderService(OrdersRepository repo) {
        this.repo = repo;
    }

    public List<OrdersEntity> getAllViewList() {

        return repo.findAll();
    }
}
