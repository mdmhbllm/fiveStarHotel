package com.example.fivestarhotel.FinalProject_RaziaSultana_2210915.GeneralManager;

import java.time.LocalDate;

public class performAudits {
    private String departmentName;
    private LocalDate lastAuditDate;
    private double auditScore;
    private String complianceStatus;
    private String auditChecklistResults;

    public performAudits(String departmentName, LocalDate lastAuditDate, double auditScore, String complianceStatus, String auditChecklistResults) {
        this.departmentName = departmentName;
        this.lastAuditDate = lastAuditDate;
        this.auditScore = auditScore;
        this.complianceStatus = complianceStatus;
        this.auditChecklistResults = auditChecklistResults;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public LocalDate getLastAuditDate() {
        return lastAuditDate;
    }

    public void setLastAuditDate(LocalDate lastAuditDate) {
        this.lastAuditDate = lastAuditDate;
    }

    public double getAuditScore() {
        return auditScore;
    }

    public void setAuditScore(double auditScore) {
        this.auditScore = auditScore;
    }

    public String getComplianceStatus() {
        return complianceStatus;
    }

    public void setComplianceStatus(String complianceStatus) {
        this.complianceStatus = complianceStatus;
    }

    public String getAuditChecklistResults() {
        return auditChecklistResults;
    }

    public void setAuditChecklistResults(String auditChecklistResults) {
        this.auditChecklistResults = auditChecklistResults;
    }

    @Override
    public String toString() {
        return "performAudits{" +
                "departmentName='" + departmentName + '\'' +
                ", lastAuditDate=" + lastAuditDate +
                ", auditScore=" + auditScore +
                ", complianceStatus='" + complianceStatus + '\'' +
                ", auditChecklistResults='" + auditChecklistResults + '\'' +
                '}';
    }
}
