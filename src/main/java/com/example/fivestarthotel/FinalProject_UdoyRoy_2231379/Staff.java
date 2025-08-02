package com.example.fivestarthotel.FinalProject_UdoyRoy_2231379;

import java.time.LocalDate;
import java.util.List;

public class Staff {
    private String staffID;
    private String name;
    private String role;
    private String department;
    private List<LocalDate> availability;

    public Staff(String staffID, String name, String role, String department, List<LocalDate> availability) {
        this.staffID = staffID;
        this.name = name;
        this.role = role;
        this.department = department;
        this.availability = availability;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<LocalDate> getAvailability() {
        return availability;
    }

    public void setAvailability(List<LocalDate> availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "staffID='" + staffID + '\'' +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", department='" + department + '\'' +
                ", availability=" + availability +
                '}';
    }
}
