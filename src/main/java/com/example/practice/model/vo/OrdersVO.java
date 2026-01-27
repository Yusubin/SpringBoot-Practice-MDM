package com.example.practice.model.vo;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.sql.Timestamp;
@Entity
@Table(name = "Orders")
public class OrdersVO {
    private String order_item_id;
    private String product_id;
    private String user_id;
    private Timestamp order_date;
    private Integer order_TotalAmount;
    private String order_PaymentMethod;
    private String order_Status;
    private Timestamp order_modifyDate;

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }
    public void setOrder_TotalAmount(Integer order_TotalAmount) {
        this.order_TotalAmount = order_TotalAmount;
    }

    public void setOrder_Status(String order_Status) {
        this.order_Status = order_Status;
    }

    public void setOrder_PaymentMethod(String order_PaymentMethod) {
        this.order_PaymentMethod = order_PaymentMethod;
    }

    public void setOrder_modifyDate(Timestamp order_modifyDate) {
        this.order_modifyDate = order_modifyDate;
    }

    public void setOrder_date(Timestamp order_date) {
        this.order_date = order_date;
    }

    public String getOrder_Status() {
        return order_Status;
    }

    public String getOrder_PaymentMethod() {
        return order_PaymentMethod;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getOrder_item_id() {
        return order_item_id;
    }

    public void setOrder_item_id(String order_item_id) {
        this.order_item_id = order_item_id;
    }

    public Integer getOrder_TotalAmount() {
        return order_TotalAmount;
    }

    public Timestamp getOrder_date() {
        return order_date;
    }

    public Timestamp getOrder_modifyDate() {
        return order_modifyDate;
    }
    @Override
    public String toString(){
        return "[order_item_id" +order_item_id+
                "\nproduct_id" +product_id+
                "\nuser_id" +user_id+
                "\norder_date" +order_date+
                "\norder_TotalAmount" +order_TotalAmount+
                "\norder_PaymentMethod" +order_PaymentMethod+
                "\norder_Status" +order_Status+
                "\norder_modifyDate"+order_modifyDate+"]";
    }
}
