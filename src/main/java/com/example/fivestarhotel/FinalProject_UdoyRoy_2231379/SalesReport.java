package com.example.fivestarhotel.FinalProject_UdoyRoy_2231379;

import java.time.LocalDate;
import java.util.List;

public class SalesReport {
    private String reportId;
    private LocalDate startDate;
    private LocalDate endDate;
    private String category;
    private List<Sales> salesData;

    public SalesReport(String reportId, LocalDate startDate, LocalDate endDate, String category, List<Sales> salesData) {
        this.reportId = reportId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.category = category;
        this.salesData = salesData;
    }

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<Sales> getSalesData() {
        return salesData;
    }

    public void setSalesData(List<Sales> salesData) {
        this.salesData = salesData;
    }

    @Override
    public String toString() {
        return "SalesReport{" +
                "reportId='" + reportId + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", category='" + category + '\'' +
                ", salesData=" + salesData +
                '}';
    }
}
