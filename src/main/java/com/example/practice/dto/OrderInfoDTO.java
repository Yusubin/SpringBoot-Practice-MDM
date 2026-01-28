package com.example.practice.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class OrderInfoDTO {
    private String OrderItemId;
    private String ProductId;
    private String UserId;
    private Timestamp OrderDate;
    private Integer OrderTotalAmount;
    private String OrderPaymentMethod;
    private String OrderStatus;
    private Timestamp OrderModifyDate;

    public OrderInfoDTO(){}
}
