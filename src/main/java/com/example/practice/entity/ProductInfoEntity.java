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
    @Column(name = "product_name")
    private String productName;
    @Column(name = "product_price")
    private String productPrice;
    @Column(name = "product_category")
    private String productCategory;
    @Column(name = "product_description")
    private String productDescription;
    @Column(name = "product_stock")
    private Integer productStock;
    @Column(name = "product_createddate")
    private Timestamp productCreatedDate;
    @Column(name = "modify_date")
    private Timestamp ModifyDate;



}
