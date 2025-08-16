package com.example.fivestarhotel.FinalProject_RaziaSultana_2210915.Supplier;

import java.time.LocalDate;
import java.time.LocalTime;

public class ScheduleDeliveries {
    private String requestId;
    private LocalDate deliveryDate;
    private LocalTime deliveryTime;
    private String deliveryVehicle;
    private String deliveryPersonnel;
    private String itemChecklist;

    public ScheduleDeliveries(String requestId, LocalDate deliveryDate, LocalTime deliveryTime, String deliveryVehicle, String deliveryPersonnel, String itemChecklist) {
        this.requestId = requestId;
        this.deliveryDate = deliveryDate;
        this.deliveryTime = deliveryTime;
        this.deliveryVehicle = deliveryVehicle;
        this.deliveryPersonnel = deliveryPersonnel;
        this.itemChecklist = itemChecklist;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
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

    public String getDeliveryVehicle() {
        return deliveryVehicle;
    }

    public void setDeliveryVehicle(String deliveryVehicle) {
        this.deliveryVehicle = deliveryVehicle;
    }

    public String getDeliveryPersonnel() {
        return deliveryPersonnel;
    }

    public void setDeliveryPersonnel(String deliveryPersonnel) {
        this.deliveryPersonnel = deliveryPersonnel;
    }

    public String getItemChecklist() {
        return itemChecklist;
    }

    public void setItemChecklist(String itemChecklist) {
        this.itemChecklist = itemChecklist;
    }

    @Override
    public String toString() {
        return "ScheduleDeliveries{" +
                "requestId='" + requestId + '\'' +
                ", deliveryDate=" + deliveryDate +
                ", deliveryTime=" + deliveryTime +
                ", deliveryVehicle='" + deliveryVehicle + '\'' +
                ", deliveryPersonnel='" + deliveryPersonnel + '\'' +
                ", itemChecklist='" + itemChecklist + '\'' +
                '}';
    }
}
