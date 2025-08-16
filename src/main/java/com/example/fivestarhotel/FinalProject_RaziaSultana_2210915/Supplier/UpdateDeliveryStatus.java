package com.example.fivestarhotel.FinalProject_RaziaSultana_2210915.Supplier;

public class UpdateDeliveryStatus {
    private String deliveryId;
    private String department;
    private Integer items;
    private String status;
    private String notes;

    public UpdateDeliveryStatus(String deliveryId, String department, Integer items, String status, String notes) {
        this.deliveryId = deliveryId;
        this.department = department;
        this.items = items;
        this.status = status;
        this.notes = notes;
    }

    public String getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getItems() {
        return items;
    }

    public void setItems(Integer items) {
        this.items = items;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "UpdateDeliveryStatus{" +
                "deliveryId='" + deliveryId + '\'' +
                ", department='" + department + '\'' +
                ", items=" + items +
                ", status='" + status + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }
}
