package com.example.practice.model.vo;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.sql.Timestamp;
@Entity
@Table(name = "payroll")
public class PayrollVO {
    private String payroll_id;
    private String Employee_ID;
    private String pay_year;
    private String pay_month;
    private Integer gross_salary;
    private Integer tax_amount;
    private Integer insurance_amount;
    private Integer net_salary;
    private Timestamp paid_at;
    private Timestamp created_at;
    private Timestamp update_at;

    public void setEmployee_ID(String employee_ID) {
        Employee_ID = employee_ID;
    }

    public String getEmployee_ID() {
        return Employee_ID;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public Integer getGross_salary() {
        return gross_salary;
    }

    public Integer getInsurance_amount() {
        return insurance_amount;
    }

    public Integer getNet_salary() {
        return net_salary;
    }

    public Timestamp getPaid_at() {
        return paid_at;
    }

    public String getPay_month() {
        return pay_month;
    }

    public String getPay_year() {
        return pay_year;
    }

    public String getPayroll_id() {
        return payroll_id;
    }

    public Integer getTax_amount() {
        return tax_amount;
    }

    public Timestamp getUpdate_at() {
        return update_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public void setGross_salary(Integer gross_salary) {
        this.gross_salary = gross_salary;
    }

    public void setInsurance_amount(Integer insurance_amount) {
        this.insurance_amount = insurance_amount;
    }

    public void setNet_salary(Integer net_salary) {
        this.net_salary = net_salary;
    }

    public void setPaid_at(Timestamp paid_at) {
        this.paid_at = paid_at;
    }

    public void setPay_month(String pay_month) {
        this.pay_month = pay_month;
    }

    public void setPay_year(String pay_year) {
        this.pay_year = pay_year;
    }

    public void setPayroll_id(String payroll_id) {
        this.payroll_id = payroll_id;
    }

    public void setTax_amount(Integer tax_amount) {
        this.tax_amount = tax_amount;
    }

    public void setUpdate_at(Timestamp update_at) {
        this.update_at = update_at;
    }


    @Override
    public String toString(){
        return "payroll_id" +payroll_id+
                "\nEmployee_ID" +Employee_ID+
                "\npay_year" +pay_year+
                "\npay_month" +pay_month+
                "\ngross_salary" +gross_salary+
                "\ntax_amount" + tax_amount+
                "\ninsurance_amount" +insurance_amount+
                "\nnet_salary" +net_salary+
                "\npaid_at" +paid_at+
                "\ncreated_at" +created_at+
                "\nupdate_at"+update_at+"]";
    }
}
