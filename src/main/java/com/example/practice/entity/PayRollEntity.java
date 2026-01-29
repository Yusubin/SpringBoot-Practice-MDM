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
    @Column(name = "employee_id")
    private String EmployeeId;
    @Column(name = "pay_year")
    private String payYear;
    @Column(name = "pay_month")
    private String payMonth;
    @Column(name = "gross_salary")
    private Integer grossSalary;
    @Column(name = "tax_amount")
    private Integer taxAmount;
    @Column(name = "insurance_amount")
    private Integer insuranceAmount;
    @Column(name = "net_salary")
    private Integer netSalary;
    @Column(name = "paid_at")
    private Timestamp paidAt;
    @Column(name = "created_at")
    private Timestamp createdAt;
    @Column(name = "update_at")
    private Timestamp updatedAt;
}
