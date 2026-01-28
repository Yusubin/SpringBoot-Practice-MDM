package com.example.practice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

import java.sql.Timestamp;

@Getter
@Entity
@Table(name = "product_info")
public class ProductInfoEntity {
    @Id
    @Column(name = "product_id")
    private String productId;

    private String productName;
    private String productPrice;
    private String productCategory;
    private String productDescription;
    private Integer productStock;
    private Timestamp productCreatedDate;
    private Timestamp ModifyDate;



}
