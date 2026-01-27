package com.example.practice.model.vo;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Salary_info")
public class SalaryInfoVO {
    private String Salary_ID;
    private String Employee_ID;
    private String Salary_base;
    private String Salary_pay_type;
    private String Salary_effective_from;
    private String Salary_effective_to;
    private String Salary_created_at;
    private String Salary_update_at;

    public String getEmployee_ID() {
        return Employee_ID;
    }
    public void setEmployee_ID(String employee_ID) {
        Employee_ID = employee_ID;
    }
    public String getSalary_base() {
        return Salary_base;
    }
    public String getSalary_created_at() {
        return Salary_created_at;
    }
    public String getSalary_effective_from() {
        return Salary_effective_from;
    }
    public String getSalary_effective_to() {
        return Salary_effective_to;
    }
    public String getSalary_ID() {
        return Salary_ID;
    }
    public String getSalary_pay_type() {
        return Salary_pay_type;
    }
    public String getSalary_update_at() {
        return Salary_update_at;
    }
    public void setSalary_base(String salary_base) {
        Salary_base = salary_base;
    }
    public void setSalary_created_at(String salary_created_at) {
        Salary_created_at = salary_created_at;
    }
    public void setSalary_effective_from(String salary_effective_from) {
        Salary_effective_from = salary_effective_from;
    }
    public void setSalary_effective_to(String salary_effective_to) {
        Salary_effective_to = salary_effective_to;
    }
    public void setSalary_ID(String salary_ID) {
        Salary_ID = salary_ID;
    }
    public void setSalary_pay_type(String salary_pay_type) {
        Salary_pay_type = salary_pay_type;
    }
    public void setSalary_update_at(String salary_update_at) {
        Salary_update_at = salary_update_at;
    }

    @Override
    public String toString(){
        return "Salary_ID" +
                "\nEmployee_ID" + Employee_ID +
                "\nSalary_base" +Salary_base+
                "\nSalary_pay_type" +Salary_pay_type+
                "\nSalary_effective_from" +Salary_effective_from+
                "\nSalary_effective_to" +Salary_effective_to+
                "\nSalary_created_at" +Salary_created_at+
                "\nSalary_update_at"+Salary_update_at+"]";
    }
}
