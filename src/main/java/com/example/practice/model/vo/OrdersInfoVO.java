package com.example.practice.model.vo;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Orders_info")
public class OrdersInfoVO {
    private String order_id;
    private String user_id;
    private Integer quantity;
    private String order_item_id;

    public String getOrder_id() {
        return order_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setOrder_item_id(String order_item_id) {
        this.order_item_id = order_item_id;
    }

    public String getOrder_item_id() {
        return order_item_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }
    @Override
    public String toString(){
        return "[order_id" +order_id+
                "\nuser_id" +user_id+
                "\nquantity" +quantity+
                "\norder_item_id"+order_item_id+"]";
    }
}
