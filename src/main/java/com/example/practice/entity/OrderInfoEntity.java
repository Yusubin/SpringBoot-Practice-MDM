package com.example.practice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Getter
@Entity
@Table(name = "orders_info")
public class OrderInfoEntity {

    @Id
    @Column(name = "order_id")
    private String orderId;
    @Column(name = "user_id")
    private String userId;
    @Column(name = "quantity")
    private Integer quantity;
    @Column(name = "order_item_id")
    private String orderItemId;

}
