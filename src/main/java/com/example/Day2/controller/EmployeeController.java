package com.example.Day2.controller;

import com.example.Day2.entity.Employee;
import com.example.Day2.model.BenefitsModel;
import com.example.Day2.model.EmployeeModel;
import com.example.Day2.service.Employeeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private Employeeservice employeeservice;
    //add employees
    @PostMapping("/add-employee")
    public Employee add(@RequestBody EmployeeModel emp){
        return employeeservice.addEmployee(emp);
    }
    //get employee by id
    @RequestMapping("/get-employee/{id}")
    public EmployeeModel getEmployeeById(@PathVariable Long id){
        return employeeservice.getEmployeeById(id);
    }
    //get all employee details
    @RequestMapping("/get-all-employees")
    public List<EmployeeModel> getAllEmployees(){
        return employeeservice.getAllEmployees();
    }
    @RequestMapping("/getByBenefit/{dept_name}")
    public List<EmployeeModel> getEmployeesByDepartment(@PathVariable String dept_name){
        return employeeservice.getByDepartment(dept_name);
    }

}
