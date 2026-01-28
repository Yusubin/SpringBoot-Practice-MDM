package com.example.practice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

import java.sql.Timestamp;

@Getter
@Entity
@Table(name = "Employee_Info")
public class EmployeeInfoEntity {
    @Id
    @Column(name = "Employee_ID")
    private String EmployeeId;
    private String EmployeeName;
    private String EmployeeEmail;
    private String EmployeeDepartment;
    private String EmployeePosition;
    private String EmployeeStatus;
    private Timestamp EmployeeCreatedAt;
    private Timestamp EmployeeUpdateAt;

}
