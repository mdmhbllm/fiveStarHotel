package com.example.fivestarhotel.FinalProject_RaziaSultana_2210915.Supplier;

import java.time.LocalDate;

public class RespondRequests {
    private String departmentName;
    private String itemsAndQuantity;
    private LocalDate deliveryDeadline;
    private String notes;
    private String status;

    public RespondRequests(String departmentName, String itemsAndQuantity, LocalDate deliveryDeadline, String notes, String status) {
        this.departmentName = departmentName;
        this.itemsAndQuantity = itemsAndQuantity;
        this.deliveryDeadline = deliveryDeadline;
        this.notes = notes;
        this.status = status;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getItemsAndQuantity() {
        return itemsAndQuantity;
    }

    public void setItemsAndQuantity(String itemsAndQuantity) {
        this.itemsAndQuantity = itemsAndQuantity;
    }

    public LocalDate getDeliveryDeadline() {
        return deliveryDeadline;
    }

    public void setDeliveryDeadline(LocalDate deliveryDeadline) {
        this.deliveryDeadline = deliveryDeadline;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "RespondRequests{" +
                "departmentName='" + departmentName + '\'' +
                ", itemsAndQuantity='" + itemsAndQuantity + '\'' +
                ", deliveryDeadline=" + deliveryDeadline +
                ", notes='" + notes + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
