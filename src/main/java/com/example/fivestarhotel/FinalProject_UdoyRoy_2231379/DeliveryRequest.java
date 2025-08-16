package com.example.fivestarhotel.FinalProject_UdoyRoy_2231379;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class DeliveryRequest implements Serializable {
    private String requestId;
    private String supplierName;
    private LocalDate deliveryDate;
    private String deliveryTime;
    private String items;
    private String status;
    private String rejectionReason;

    public DeliveryRequest(String requestId, String supplierName, LocalDate deliveryDate, String deliveryTime, String items, String status, String rejectionReason) {
        this.requestId = requestId;
        this.supplierName = supplierName;
        this.deliveryDate = deliveryDate;
        this.deliveryTime = deliveryTime;
        this.items = items;
        this.status = status;
        this.rejectionReason = rejectionReason;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRejectionReason() {
        return rejectionReason;
    }

    public void setRejectionReason(String rejectionReason) {
        this.rejectionReason = rejectionReason;
    }

    @Override
    public String toString() {
        return "DeliveryRequest{" +
                "requestId='" + requestId + '\'' +
                ", supplierName='" + supplierName + '\'' +
                ", deliveryDate=" + deliveryDate +
                ", deliveryTime='" + deliveryTime + '\'' +
                ", items='" + items + '\'' +
                ", status='" + status + '\'' +
                ", rejectionReason='" + rejectionReason + '\'' +
                '}';
    }
}
