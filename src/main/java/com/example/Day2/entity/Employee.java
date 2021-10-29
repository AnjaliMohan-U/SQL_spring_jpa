package com.example.Day2.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eid;

    @Column
    private String emp_name;
    @Column
    private int salary;

    @OneToOne(cascade = CascadeType.ALL)
    private Benefits benefits;

    @OneToOne(cascade = CascadeType.ALL)
    private Department department;

    @OneToOne(cascade = CascadeType.ALL)
    private Locations locations;

    public Employee(){
    }

    public Locations getLocations() {
        return locations;
    }

    public void setLocations(Locations locations) {
        this.locations = locations;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Long getEid() {
        return eid;
    }

    public void setEid(Long eid) {
        this.eid = eid;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public Benefits getBenefits() {
        return benefits;
    }

    public void setBenefits(Benefits benefits) {
        this.benefits = benefits;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

}
