package com.example.fivestarhotel.FinalProject_UdoyRoy_2231379;

import java.time.LocalDate;

public class Benefit {
    private String benefitId;
    private String type;
    private LocalDate startDate;
    private String dependents;
    private String employeeId;

    public Benefit(String benefitId, String type, LocalDate startDate, String dependents, String employeeId) {
        this.benefitId = benefitId;
        this.type = type;
        this.startDate = startDate;
        this.dependents = dependents;
        this.employeeId = employeeId;
    }

    public String getBenefitId() {
        return benefitId;
    }

    public void setBenefitId(String benefitId) {
        this.benefitId = benefitId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public String getDependents() {
        return dependents;
    }

    public void setDependents(String dependents) {
        this.dependents = dependents;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "Benefit{" +
                "benefitId='" + benefitId + '\'' +
                ", type='" + type + '\'' +
                ", startDate=" + startDate +
                ", dependents='" + dependents + '\'' +
                ", employeeId='" + employeeId + '\'' +
                '}';
    }
}
