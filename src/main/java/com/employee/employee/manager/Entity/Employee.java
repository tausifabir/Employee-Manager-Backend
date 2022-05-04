package com.employee.employee.manager.Entity;


import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,updatable = false)
    private Long employeeId;
    private String employeeFirstName;
    private String employeeLastName;
    private String employeeEmail;
    private String employeeDesignation;
    private String employeePhone;
    private String employeeImageUrl;
    @Column(nullable = false,updatable = false)
    private String employeeCode;
    private String employeeBlood;

    public Employee(String employeeFirstName, String employeeLastName, String employeeEmail, String employeeDesignation, String employeePhone,String employeeImageUrl) {
        this.employeeFirstName = employeeFirstName;
        this.employeeLastName = employeeLastName;
        this.employeeEmail = employeeEmail;
        this.employeeDesignation = employeeDesignation;
        this.employeePhone = employeePhone;
        this.employeeImageUrl = employeeImageUrl;
    }

    public Employee(String employeeFirstName, String employeeLastName, String employeeEmail, String employeeDesignation, String employeePhone, String employeeImageUrl, String employeeCode, String employeeBlood) {
        this.employeeFirstName = employeeFirstName;
        this.employeeLastName = employeeLastName;
        this.employeeEmail = employeeEmail;
        this.employeeDesignation = employeeDesignation;
        this.employeePhone = employeePhone;
        this.employeeImageUrl = employeeImageUrl;
        this.employeeCode = employeeCode;
        this.employeeBlood = employeeBlood;
    }

    public Employee() {

    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public void setEmployeeFirstName(String employeeFirstName) {
        this.employeeFirstName = employeeFirstName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public void setEmployeeLastName(String employeeLastName) {
        this.employeeLastName = employeeLastName;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeeDesignation() {
        return employeeDesignation;
    }

    public void setEmployeeDesignation(String employeeDesignation) {
        this.employeeDesignation = employeeDesignation;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    public String getEmployeeImageUrl() {
        return employeeImageUrl;
    }

    public void setEmployeeImageUrl(String employeeImageUrl) {
        this.employeeImageUrl = employeeImageUrl;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getEmployeeBlood() {
        return employeeBlood;
    }

    public void setEmployeeBlood(String employeeBlood) {
        this.employeeBlood = employeeBlood;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeFirstName='" + employeeFirstName + '\'' +
                ", employeeLastName='" + employeeLastName + '\'' +
                ", employeeEmail='" + employeeEmail + '\'' +
                ", employeeDesignation='" + employeeDesignation + '\'' +
                ", employeePhone='" + employeePhone + '\'' +
                ", employeeImageUrl='" + employeeImageUrl + '\'' +
                ", employeeCode='" + employeeCode + '\'' +
                ", employeeBlood='" + employeeBlood + '\'' +
                '}';
    }
}
