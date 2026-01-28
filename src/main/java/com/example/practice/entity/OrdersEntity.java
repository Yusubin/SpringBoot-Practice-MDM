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
@Table(name = "Orders")
public class OrdersEntity {

    @Id
    @Column(name = "order_item_id")
    private String OrderItemId;
    private String ProductId;
    private String UserId;
    private Timestamp OrderDate;
    private Integer OrderTotalAmount;
    private String OrderPaymentMethod;
    private String OrderStatus;
    private Timestamp OrderModifyDate;

}
