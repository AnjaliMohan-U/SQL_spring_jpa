package com.example.Day2.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "benefits")
public class Benefits {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long b_id;

    @Column
    private String benefit_name;

    @Column
    private String benefit_desc;

    @OneToOne(mappedBy = "benefits")
    private Employee employee;

    public Benefits(){

    }

    public Long getB_id() {
        return b_id;
    }

    public void setB_id(Long b_id) {
        this.b_id = b_id;
    }

    public String getBenefit_name() {
        return benefit_name;
    }

    public void setBenefit_name(String benefit_name) {
        this.benefit_name = benefit_name;
    }

    public String getBenefit_desc() {
        return benefit_desc;
    }

    public void setBenefit_desc(String benefit_desc) {
        this.benefit_desc = benefit_desc;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Benefits{" +
                "b_id=" + b_id +
                ", benefit_name='" + benefit_name + '\'' +
                ", benefit_desc='" + benefit_desc + '\'' +
                ", employee=" + employee +
                '}';
    }
}
