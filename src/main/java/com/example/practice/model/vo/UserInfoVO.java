package com.example.practice.model.vo;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.sql.Timestamp;
//@Entity
//@Table(name = "user_info")

public class UserInfoVO {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String user_id;

//    @Column(nullable = false)
    private String user_password;

//    @Column(nullable = false)
    private String user_email;

//    @Column(nullable = true)
    private String user_address;

//    @Column(nullable = true)
    private String user_rank;

//    @Column(nullable = true)
    private String user_phonenumber;

//    @Column(nullable = true)
    private String user_active;

//    @Column(nullable = true)
    private Timestamp user_modifyDate;

//    @Column(nullable = true)
    private Timestamp user_date;




    public String getUser_id() {
        return user_id;
    }

    public String getUser_password() {
        return user_password;
    }

    public String getUser_email() {
        return user_email;
    }
    public String getUser_address() {
        return user_address;
    }

    public String getUser_rank() {
        return user_rank;
    }

    public String getUser_phonenumber() {
        return user_phonenumber;
    }

    public String getUser_active() {
        return user_active;
    }

    public Timestamp getUser_modifyDate() {
        return user_modifyDate;
    }

    public Timestamp getUser_date() {
        return user_date;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public void setUser_address(String user_address) {
        this.user_address = user_address;
    }

    public void setUser_rank(String user_rank) {
        this.user_rank = user_rank;
    }

    public void setUser_phonenumber(String user_phonenumber) {
        this.user_phonenumber = user_phonenumber;
    }

    public void setUser_active(String user_active) {
        this.user_active = user_active;
    }

    public void setUser_modifyDate(Timestamp user_modifyDate) {
        this.user_modifyDate = user_modifyDate;
    }

    public void setUser_date(Timestamp user_date) {
        this.user_date = user_date;
    }

    @Override
    public String toString(){
        return "userInfoVO [user_id" + user_id +
                "\n user_password" + user_password+
                "\nuser_email" +user_email+
                "\nuser_address" +user_address+
                "\nuser_rank" +user_rank+
                "\nuser_phonenumber" +user_phonenumber+
                "\nuser_active" +user_active+
                "\nuser_modifyDate" +user_modifyDate+
                "\nuser_date"+user_date+"]";
    }
}
