package com.example.fivestarthotel.FinalProject_RaziaSultana_2210915.GeneralManager;

import java.time.LocalDate;

public class departmentOperation {
    private String departmentName,operationalStatus,pendingIssues;
    private Integer staffOnDuty;
    private LocalDate operationalDate;

    public departmentOperation(String departmentName, String operationalStatus, String pendingIssues, Integer staffOnDuty, LocalDate operationalDate) {
        this.departmentName = departmentName;
        this.operationalStatus = operationalStatus;
        this.pendingIssues = pendingIssues;
        this.staffOnDuty = staffOnDuty;
        this.operationalDate = operationalDate;
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

    public String getPendingIssues() {
        return pendingIssues;
    }

    public void setPendingIssues(String pendingIssues) {
        this.pendingIssues = pendingIssues;
    }

    public Integer getStaffOnDuty() {
        return staffOnDuty;
    }

    public void setStaffOnDuty(Integer staffOnDuty) {
        this.staffOnDuty = staffOnDuty;
    }

    public LocalDate getOperationalDate() {
        return operationalDate;
    }

    public void setOperationalDate(LocalDate operationalDate) {
        this.operationalDate = operationalDate;
    }

    @Override
    public String toString() {
        return "departmentOperation{" +
                "departmentName='" + departmentName + '\'' +
                ", operationalStatus='" + operationalStatus + '\'' +
                ", pendingIssues='" + pendingIssues + '\'' +
                ", staffOnDuty=" + staffOnDuty +
                ", operationalDate=" + operationalDate +
                '}';
    }
}
