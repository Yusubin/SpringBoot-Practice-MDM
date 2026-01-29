package com.example.practice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

import java.sql.Time;
import java.sql.Timestamp;

@Entity
@Getter
@Table(name = "orders")
public class OrdersEntity {

    @Id
    @Column(name = "order_item_id")
    private String OrderItemId;
    @Column(name = "product_id")
    private String ProductId;
    @Column(name = "user_id")
    private String UserId;
    @Column(name = "order_date")
    private Timestamp OrderDate;
    @Column(name = "order_TotalAmount")
    private Integer OrderTotalAmount;
    @Column(name = "order_PaymentMethod")
    private String OrderPaymentMethod;
    @Column(name = "order_Status")
    private String OrderStatus;
    @Column(name = "order_modifyDate")
    private Timestamp OrderModifyDate;

}
