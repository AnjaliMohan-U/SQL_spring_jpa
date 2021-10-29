package com.example.Day2.service;

import com.example.Day2.entity.Benefits;
import com.example.Day2.entity.Department;
import com.example.Day2.entity.Employee;
import com.example.Day2.entity.Locations;
import com.example.Day2.model.BenefitsModel;
import com.example.Day2.model.DepartmentsModel;
import com.example.Day2.model.EmployeeModel;
import com.example.Day2.model.LocationModel;
import com.example.Day2.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class Employeeservice {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee addEmployee(EmployeeModel emp) {
        Benefits benefits = new Benefits();
        benefits.setBenefit_name(emp.getBenefitsModel().getBenefit_name());
        benefits.setBenefit_desc(emp.getBenefitsModel().getBenefit_description());

        Department dept = new Department();
        dept.setDept_name(emp.getDepartmentsModel().getDept_name());

        Locations locations = new Locations();
        locations.setCity(emp.getLocationModel().getCity());
        locations.setCountry(emp.getLocationModel().getCountry());

        Employee employee = new Employee();
        employee.setEmp_name(emp.getEmp_name());
        employee.setBenefits(benefits);
        employee.setDepartment(dept);
        employee.setLocations(locations);
        employee.setSalary(emp.getEmp_sal());

        return employeeRepository.save(employee);
    }

    private EmployeeModel getEmployeeModel(Employee employee){
        EmployeeModel employeeModel = new EmployeeModel();
        BenefitsModel benefitsModel = new BenefitsModel();
        DepartmentsModel departmentsModel = new DepartmentsModel();
        LocationModel locationModel = new LocationModel();
        benefitsModel.setBenefit_name(employee.getBenefits().getBenefit_name());
        benefitsModel.setBenefit_description(employee.getBenefits().getBenefit_desc());
        departmentsModel.setDept_name(employee.getDepartment().getDept_name());
        locationModel.setCity(employee.getLocations().getCity());
        locationModel.setCountry(employee.getLocations().getCountry());
        employeeModel.setDepartmentsModel(departmentsModel);
        employeeModel.setBenefitsModel(benefitsModel);
        employeeModel.setLocationModel(locationModel);
        employeeModel.setEmp_sal(employee.getSalary());
        employeeModel.setEmp_name(employee.getEmp_name());
        return employeeModel;
    }

    public EmployeeModel getEmployeeById(Long id) {
        Optional<Employee> emp_details = employeeRepository.findById(id);
        if(emp_details.isPresent()){
            return getEmployeeModel(emp_details.get());
        }
        return null;
    }

    public List<EmployeeModel> getAllEmployees() {
        List<Employee> allEmployees = employeeRepository.findAll();
        return  allEmployees.stream().map(employee -> getEmployeeModel(employee)).collect(Collectors.toList());
    }

    public List<EmployeeModel> getByDepartment(String dept_name) {
        List<Employee> employees = employeeRepository.findAll();
        return employees.stream().filter(x -> x.getDepartment().getDept_name().equals(dept_name)).map(e -> getEmployeeModel(e)).collect(Collectors.toList());
    }

}
