package com.example.practice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

import java.sql.Timestamp;
@Getter
@Entity
@Table(name = "employee_info")
public class EmployeeInfoEntity {

    @Id
    @Column(name = "employee_id")
    private String employeeId;

    @Column(name = "employee_name")
    private String employeeName;

    @Column(name = "employee_email")
    private String employeeEmail;

    @Column(name = "employee_department")
    private String employeeDepartment;

    @Column(name = "employee_position")
    private String employeePosition;

    @Column(name = "employee_status")
    private String employeeStatus;

    @Column(name = "employee_created_at")
    private Timestamp employeeCreatedAt;

    @Column(name = "employee_updated_at")  // 필드 이름 확인!
    private Timestamp employeeUpdatedAt;  // 이 필드 이름이 `employeeUpdateAt`이 아니라 `employeeUpdatedAt`입니다!
}


