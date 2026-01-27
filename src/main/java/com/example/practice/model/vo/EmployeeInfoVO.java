package com.example.practice.model.vo;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.sql.Timestamp;
@Entity
@Table(name = "Employee_info")
public class EmployeeInfoVO {
    private String Employee_ID;
    private String Employee_Name;
    private String Employee_Email;
    private String Employee_department;
    private String Employee_position;
    private String Employee_status;
    private Timestamp Employee_created_at;
    private Timestamp Employee_updated_at;


    public String getEmployee_department() {
        return Employee_department;
    }
    public String getEmployee_Email() {
        return Employee_Email;
    }
    public String getEmployee_ID() {
        return Employee_ID;
    }
    public String getEmployee_Name() {
        return Employee_Name;
    }
    public String getEmployee_position() {
        return Employee_position;
    }
    public String getEmployee_status() {
        return Employee_status;
    }
    public Timestamp getEmployee_created_at() {
        return Employee_created_at;
    }
    public Timestamp getEmployee_updated_at() {
        return Employee_updated_at;
    }

    public void setEmployee_department(String employee_department) {
        Employee_department = employee_department;
    }
    public void setEmployee_Email(String employee_Email) {
        Employee_Email = employee_Email;
    }
    public void setEmployee_ID(String employee_ID) {
        Employee_ID = employee_ID;
    }
    public void setEmployee_Name(String employee_Name) {
        Employee_Name = employee_Name;
    }
    public void setEmployee_position(String employee_position) {
        Employee_position = employee_position;
    }
    public void setEmployee_status(String employee_status) {
        Employee_status = employee_status;
    }
    public void setEmployee_updated_at(Timestamp employee_updated_at) {
        Employee_updated_at = employee_updated_at;
    }
    public void setEmployee_created_at(Timestamp employee_created_at) {
        Employee_created_at = employee_created_at;
    }

    @Override
    public String toString(){
        return "[Employee_ID" +Employee_ID+
                "\nEmployee_Name" +Employee_Name+
                "\nEmployee_Email" +Employee_Email+
                "\nEmployee_department" +Employee_department+
                "\nEmployee_position" +Employee_position+
                "\nEmployee_status" +Employee_status+
                "\nEmployee_created_at" +Employee_created_at+
                "\nEmployee_updated_at"+Employee_updated_at+"]";
    }
}
