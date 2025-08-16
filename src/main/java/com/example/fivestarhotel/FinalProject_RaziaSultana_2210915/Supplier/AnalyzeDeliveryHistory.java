package com.example.fivestarhotel.FinalProject_RaziaSultana_2210915.Supplier;

import java.time.LocalDate;

public class AnalyzeDeliveryHistory {
    private Integer numberOfDeliveries;
    private double onTimeRate;
    private String issueReports;
    private LocalDate startDate;
    private LocalDate endDate;

    public AnalyzeDeliveryHistory(Integer numberOfDeliveries, double onTimeRate, String issueReports, LocalDate startDate, LocalDate endDate) {
        this.numberOfDeliveries = numberOfDeliveries;
        this.onTimeRate = onTimeRate;
        this.issueReports = issueReports;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Integer getNumberOfDeliveries() {
        return numberOfDeliveries;
    }

    public void setNumberOfDeliveries(Integer numberOfDeliveries) {
        this.numberOfDeliveries = numberOfDeliveries;
    }

    public double getOnTimeRate() {
        return onTimeRate;
    }

    public void setOnTimeRate(double onTimeRate) {
        this.onTimeRate = onTimeRate;
    }

    public String getIssueReports() {
        return issueReports;
    }

    public void setIssueReports(String issueReports) {
        this.issueReports = issueReports;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "AnalyzeDeliveryHistory{" +
                "numberOfDeliveries=" + numberOfDeliveries +
                ", onTimeRate=" + onTimeRate +
                ", issueReports='" + issueReports + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
