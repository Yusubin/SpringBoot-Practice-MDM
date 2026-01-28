package com.example.practice.dto;

public class LoginRequestDto {
    private String userId;
    private String userPassword;

    public LoginRequestDto() {}

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}