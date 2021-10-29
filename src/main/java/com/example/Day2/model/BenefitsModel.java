package com.example.Day2.model;

public class BenefitsModel {
    private String benefit_name;
    private String benefit_description;

    public String getBenefit_name() {
        return benefit_name;
    }

    public void setBenefit_name(String benefit_name) {
        this.benefit_name = benefit_name;
    }

    public String getBenefit_description() {
        return benefit_description;
    }

    public void setBenefit_description(String benefit_description) {
        this.benefit_description = benefit_description;
    }

    @Override
    public String toString() {
        return "BenefitsModel{" +
                "benefit_name='" + benefit_name + '\'' +
                ", benefit_description='" + benefit_description + '\'' +
                '}';
    }
}
