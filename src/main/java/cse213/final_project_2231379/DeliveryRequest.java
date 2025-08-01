package cse213.final_project_2231379;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class DeliveryRequest {
    private int requestId;
    private String supplierName;
    private LocalDate deliveryDate;
    private LocalTime deliveryTime;
    private List<String> items;
    private String status;
    private String rejectionReason;

    public DeliveryRequest(int requestId, String supplierName, LocalDate deliveryDate, LocalTime deliveryTime, List<String> items, String status, String rejectionReason) {
        this.requestId = requestId;
        this.supplierName = supplierName;
        this.deliveryDate = deliveryDate;
        this.deliveryTime = deliveryTime;
        this.items = items;
        this.status = status;
        this.rejectionReason = rejectionReason;
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
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

    public LocalTime getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(LocalTime deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
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
                "requestId=" + requestId +
                ", supplierName='" + supplierName + '\'' +
                ", deliveryDate=" + deliveryDate +
                ", deliveryTime=" + deliveryTime +
                ", items=" + items +
                ", status='" + status + '\'' +
                ", rejectionReason='" + rejectionReason + '\'' +
                '}';
    }
}
