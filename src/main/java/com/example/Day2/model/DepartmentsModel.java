package com.example.Day2.model;

public class DepartmentsModel {
    private String dept_name;

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    @Override
    public String toString() {
        return "Departments{" +
                "dept_name='" + dept_name + '\'' +
                '}';
    }
}
