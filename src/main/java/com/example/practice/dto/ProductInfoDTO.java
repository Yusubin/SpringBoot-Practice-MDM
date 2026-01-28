package com.example.practice.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class ProductInfoDTO {
    private String productName;
    private String productPrice;
    private String productCategory;
    private String productDescription;
    private Integer productStock;
    private Timestamp productCreatedDate;
    private Timestamp ModifyDate;

    public ProductInfoDTO(){}
}
