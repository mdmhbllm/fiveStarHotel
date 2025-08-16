package com.example.fivestarhotel.FinalProject_RaziaSultana_2210915.GeneralManager;

import java.time.LocalDate;

public class SuperviseOperations {
    private String departmentName;
    private String operationalStatus;
    private int staffOnDuty;
    private int pendingIssues;
    private LocalDate date;

    public SuperviseOperations(String departmentName, String operationalStatus, int staffOnDuty, int pendingIssues, LocalDate date) {
        this.departmentName = departmentName;
        this.operationalStatus = operationalStatus;
        this.staffOnDuty = staffOnDuty;
        this.pendingIssues = pendingIssues;
        this.date = date;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getOperationalStatus() {
        return operationalStatus;
    }

    public void setOperationalStatus(String operationalStatus) {
        this.operationalStatus = operationalStatus;
    }

    public int getStaffOnDuty() {
        return staffOnDuty;
    }

    public void setStaffOnDuty(int staffOnDuty) {
        this.staffOnDuty = staffOnDuty;
    }

    public int getPendingIssues() {
        return pendingIssues;
    }

    public void setPendingIssues(int pendingIssues) {
        this.pendingIssues = pendingIssues;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "SuperviseOperations{" +
                "departmentName='" + departmentName + '\'' +
                ", operationalStatus='" + operationalStatus + '\'' +
                ", staffOnDuty=" + staffOnDuty +
                ", pendingIssues=" + pendingIssues +
                ", date=" + date +
                '}';
    }
}
