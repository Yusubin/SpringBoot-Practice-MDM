package com.example.practice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Table(name = "user_info")
@Getter
@Setter
public class UserInfoEntity {
    @Id
    @Column(name = "user_id")
    private String userId;

    @Column(nullable = false)
    private String userPassword;

    @Column(nullable = false)
    private String userEmail;

    private String userAddress;
    private String userRank;
    private String userPhonenumber;
    private String userActive;

    private Timestamp userModifyDate;
    private Timestamp userDate;



}

