package com.example.practice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

import java.sql.Timestamp;

@Entity
@Getter
@Table(name = "salary_info")
public class SalaryInfoEntity {
    @Id
    @Column(name = "salary_id")
    private String SalaryId;
    @Column(name = "employee_id")
    private String EmployeeId;
    @Column(name = "salary_base")
    private Integer SalaryBase;
    @Column(name = "salary_pay_type")
    private String SalaryPayType;
    @Column(name = "salary_effective_from")
    private Timestamp SalaryEffectiveFrom;
    @Column(name = "salary_effective_to")
    private Timestamp SalaryEffectiveTo;
    @Column(name = "salary_created_at")
    private Timestamp SalaryCreatedAt;
    @Column(name = "salary_update_at")
    private Timestamp SalaryUpdateAt;
}
