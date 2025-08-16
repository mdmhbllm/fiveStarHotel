package com.example.fivestarhotel.FinalProject_UdoyRoy_2231379;

import java.io.Serializable;
import java.time.LocalDate;

public class Employee implements Serializable {
    private String employeeId;
    private String name;
    private String department;
    private String role;
    private LocalDate hireDate;
    private String shiftPre;
    private String DaysAvailable;
    private LocalDate terminationDate;
    private String terminationReason;

    public Employee(String employeeId, String name, String department, String role, LocalDate hireDate, String shiftPre, String daysAvailable, LocalDate terminationDate, String terminationReason) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.role = role;
        this.hireDate = hireDate;
        this.shiftPre = shiftPre;
        DaysAvailable = daysAvailable;
        this.terminationDate = terminationDate;
        this.terminationReason = terminationReason;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public String getShiftPre() {
        return shiftPre;
    }

    public void setShiftPre(String shiftPre) {
        this.shiftPre = shiftPre;
    }

    public String getDaysAvailable() {
        return DaysAvailable;
    }

    public void setDaysAvailable(String daysAvailable) {
        DaysAvailable = daysAvailable;
    }

    public LocalDate getTerminationDate() {
        return terminationDate;
    }

    public void setTerminationDate(LocalDate terminationDate) {
        this.terminationDate = terminationDate;
    }

    public String getTerminationReason() {
        return terminationReason;
    }

    public void setTerminationReason(String terminationReason) {
        this.terminationReason = terminationReason;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", role='" + role + '\'' +
                ", hireDate=" + hireDate +
                ", shiftPre='" + shiftPre + '\'' +
                ", DaysAvailable='" + DaysAvailable + '\'' +
                ", terminationDate=" + terminationDate +
                ", terminationReason='" + terminationReason + '\'' +
                '}';
    }
}
