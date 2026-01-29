package com.example.practice.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class SalaryInfoDTO {
    private String SalaryId;
    private String EmployeeID;
    private Integer SalaryBase;
    private String SalaryPayType;
    private Timestamp SalaryEffectiveFrom;
    private Timestamp SalaryEffectiveTo;
    private Timestamp SalaryCreatedAt;
    private Timestamp SalaryUpdateAt;

    public SalaryInfoDTO(){}
}
