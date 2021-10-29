package com.example.Day2.entity;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long did;

    private String dept_name;

    @OneToOne(mappedBy = "department")
    private Employee employee;

    public Department(){
    }

    public Long getDid() {
        return did;
    }

    public void setDid(Long did) {
        this.did = did;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Department{" +
                "did=" + did +
                ", dept_name='" + dept_name + '\'' +
                ", employee=" + employee +
                '}';
    }
}
