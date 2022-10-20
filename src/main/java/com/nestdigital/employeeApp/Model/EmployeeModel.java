package com.nestdigital.employeeApp.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class EmployeeModel {
    @Id
    @GeneratedValue

    private int id;
    private String name;
    private String address;
    private String email;
    private String designation;
    private String department;
    private String mob;
    private int salary;

    public EmployeeModel(int id, String name, String address, String email, String designation, String department, String mob, int salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.designation = designation;
        this.department = department;
        this.mob = mob;
        this.salary = salary;
    }

    public EmployeeModel() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getDesignation() {
        return designation;
    }

    public String getDepartment() {
        return department;
    }

    public String getMob() {
        return mob;
    }

    public int getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}