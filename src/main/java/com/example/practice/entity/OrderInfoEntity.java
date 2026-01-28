package com.example.practice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Getter
@Entity
@Table(name = "Orders_info")
public class OrderInfoEntity {

    @Id
    @Column(name = "order_id")
    private String orderId;
    private String userId;
    private String orderItemId;
    private Integer quantity;


}
