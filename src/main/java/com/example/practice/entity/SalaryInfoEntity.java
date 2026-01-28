package com.example.practice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

import java.sql.Timestamp;

@Entity
@Getter
@Table(name = "Salary_info")
public class SalaryInfoEntity {
    @Id
    @Column(name = "Salary_ID")
    private String SalaryId;
    private String EmployeeID;
    private Integer SalaryBase;
    private String SalaryPayType;
    private Timestamp SalaryEffectiveFrom;
    private Timestamp SalaryEffectiveTo;
    private Timestamp SalaryCreatedAt;
    private Timestamp SalaryUpdateAt;
}
