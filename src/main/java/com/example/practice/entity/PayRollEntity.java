package com.example.practice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

import java.sql.Timestamp;

@Getter
@Entity
@Table(name = "payroll")
public class PayRollEntity {
    @Id
    @Column(name = "payroll_id")
    private String payrollId;
    private String EmployeeID;
    private String payYear;
    private String payMonth;
    private Integer grossSalary;
    private Integer taxAmount;
    private Integer insuranceAmount;
    private Integer netSalary;
    private Timestamp paidAt;
    private Timestamp createdAt;;
}
