package com.example.practice.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class PayrollDTO {
    private String payrollId;
    private String EmployeeID;
    private String payYear;
    private String payMonth;
    private Integer grossSalary;
    private Integer taxAmount;
    private Integer insuranceAmount;
    private Integer netSalary;
    private Timestamp paidAt;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    public PayrollDTO(){}
}
