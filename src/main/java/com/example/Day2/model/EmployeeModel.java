package com.example.Day2.model;

public class EmployeeModel {
    private String emp_name;
    private int emp_sal;
    private DepartmentsModel departmentsModel;
    private BenefitsModel benefitsModel;
    private LocationModel locationModel;
    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public int getEmp_sal() {
        return emp_sal;
    }

    public void setEmp_sal(int emp_sal) {
        this.emp_sal = emp_sal;
    }

    public LocationModel getLocationModel() {
        return locationModel;
    }

    public void setLocationModel(LocationModel locationModel) {
        this.locationModel = locationModel;
    }

    public DepartmentsModel getDepartmentsModel() {
        return departmentsModel;
    }

    public void setDepartmentsModel(DepartmentsModel departmentsModel) {
        this.departmentsModel = departmentsModel;
    }

    public BenefitsModel getBenefitsModel() {
        return benefitsModel;
    }

    public void setBenefitsModel(BenefitsModel benefitsModel) {
        this.benefitsModel = benefitsModel;
    }

    @Override
    public String toString() {
        return "EmployeeModel{" +
                "emp_name='" + emp_name + '\'' +
                ", emp_sal=" + emp_sal +
                ", departmentsModel=" + departmentsModel +
                ", benefitsModel=" + benefitsModel +
                ", locationModel=" + locationModel +
                '}';
    }
}
