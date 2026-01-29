package com.example.practice.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class OrderInfoDTO {
    private String orderId;
    private String userId;
    private String orderItemId;
    private Integer quantity;

    public OrderInfoDTO(){}
}
