package com.employees.employee.system.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employee {
    private int empId;
    private String firstName;
    private String lastName;
    private String email;
    private String department;
    private String contactNo;


    public Employee(){}





    public Employee(int empId,String firstName, String lastName, String email, String department, String contactNo){
        this.empId=empId;
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.department=department;
        this.contactNo=contactNo;
    }


//Getters and Setters
    @Id
    @GeneratedValue
    public int getEmpId() {
        return this.empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }


    public String getFirstName() {
        return this.firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return this.lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }


    public String getDepartment() {
        return this.department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }


    public String getContactNo() {
        return this.contactNo;
    }
    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
    }
    
