package com.example.fivestarhotel.FinalProject_MahbubAlam_2221100.Hotel;

import java.io.Serializable;

public class Room implements Serializable {
    private String roomId;
    private String roomType;
    private double price;
    private String status;
    private String description;

    public Room(String roomId, String roomType, double price, String status, String description) {
        this.roomId = roomId;
        this.roomType = roomType;
        this.price = price;
        this.status = status;
        this.description = description;
    }

    public void markAsBooked() {
        this.status = "Sold Out";
        updateRoomStatus();
    }

    public void markAsAvailable() {
        this.status = "Available";
        updateRoomStatus();
    }

    public void markForCleaning() {
        this.status = "Cleaning";
        updateRoomStatus();
    }

    public double getPricePerNight() {
        return this.price;
    }


    public void updateRoomStatus() {
        System.out.println("Room " + roomId + " status updated to: " + status);
    }


    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        updateRoomStatus();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomId='" + roomId + '\'' +
                ", roomType='" + roomType + '\'' +
                ", price=" + price +
                ", status='" + status + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public String getRoomNumber() {
        return roomId;
    }
}
