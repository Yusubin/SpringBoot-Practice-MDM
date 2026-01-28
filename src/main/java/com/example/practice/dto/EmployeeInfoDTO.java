package com.example.practice.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Getter
@Setter
public class EmployeeInfoDTO {
    private String employeeId;
    private String employeeName;
    private String employeeEmail;
    private String employeeDepartment;
    private String employeePosition;
    private String employeeStatus;
    private Timestamp employeeCreatedAt;
    private Timestamp employeeUpdatedAt;
    public EmployeeInfoDTO() {}
}
