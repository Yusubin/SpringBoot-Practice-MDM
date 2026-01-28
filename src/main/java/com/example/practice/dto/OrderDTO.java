package com.example.practice.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderDTO {
    private String orderId;
    private String userId;
    private String orderItemId;
    private Integer quantity;

    public OrderDTO(){}
}
