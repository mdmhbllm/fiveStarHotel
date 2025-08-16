package com.example.fivestarhotel.FinalProject_UdoyRoy_2231379;

import java.time.LocalDate;
import java.util.List;

public class SalesReport {
    private String reportId;
    private LocalDate startDate;
    private LocalDate endDate;
    private float totalAmount;
    private String itemSold;
    private String paymentMethod;
    private String category;

    public SalesReport(String reportId, LocalDate startDate, LocalDate endDate, float totalAmount, String itemSold, String paymentMethod, String category) {
        this.reportId = reportId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalAmount = totalAmount;
        this.itemSold = itemSold;
        this.paymentMethod = paymentMethod;
        this.category = category;
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

    public float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getItemSold() {
        return itemSold;
    }

    public void setItemSold(String itemSold) {
        this.itemSold = itemSold;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "SalesReport{" +
                "reportId='" + reportId + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", totalAmount=" + totalAmount +
                ", itemSold='" + itemSold + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
