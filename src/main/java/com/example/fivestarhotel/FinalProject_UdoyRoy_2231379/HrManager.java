package com.example.fivestarhotel.FinalProject_UdoyRoy_2231379;

import java.time.LocalDate;

public class HrManager {
    private int employeeId;
    private String name;
    private String department;
    private LocalDate hireDate;

    public HrManager(int employeeId, String name, String department, LocalDate hireDate) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.hireDate = hireDate;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "HrManager{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", hireDate=" + hireDate +
                '}';
    }
}
