package com.example.fivestarhotel.FinalProject_RaziaSultana_2210915.Supplier;

import java.time.LocalDate;

public class TrackPayments {
    private String deliveryId;
    private Integer itemsSupplied;
    private double amount;
    private String paymentStatus;
    private LocalDate deliveryDate;
    private String department;

    public TrackPayments(String deliveryId, Integer itemsSupplied, double amount, String paymentStatus, LocalDate deliveryDate, String department) {
        this.deliveryId = deliveryId;
        this.itemsSupplied = itemsSupplied;
        this.amount = amount;
        this.paymentStatus = paymentStatus;
        this.deliveryDate = deliveryDate;
        this.department = department;
    }

    public String getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId;
    }

    public Integer getItemsSupplied() {
        return itemsSupplied;
    }

    public void setItemsSupplied(Integer itemsSupplied) {
        this.itemsSupplied = itemsSupplied;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "TrackPayments{" +
                "deliveryId='" + deliveryId + '\'' +
                ", itemsSupplied=" + itemsSupplied +
                ", amount=" + amount +
                ", paymentStatus='" + paymentStatus + '\'' +
                ", deliveryDate=" + deliveryDate +
                ", department='" + department + '\'' +
                '}';
    }
}
