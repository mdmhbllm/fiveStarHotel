package com.example.fivestarhotel.FinalProject_MahbubAlam_2221100.Hotel;

import javafx.scene.control.Button;

public class RoomTableViewRowSetting {
    private String roomId;
    private String roomType;
    private double price;
    private String status;      //"Available", "Booked", "Cleaning"
    private Button actionButton;


    public RoomTableViewRowSetting(Room roomObject){
        this.roomId = roomObject.getRoomId();
        this.roomType = roomObject.getRoomType();
        this.price = roomObject.getPrice();
        this.status = roomObject.getStatus();
        this.actionButton = new Button("Select");
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
    }


    public Button getActionButton() {
        return actionButton;
    }

    public void setActionButton(Button actionButton) {
        this.actionButton = actionButton;
    }

    @Override
    public String toString() {
        return "RoomRowTableViewSetting{" +
                "roomId='" + roomId + '\'' +
                ", roomType='" + roomType + '\'' +
                ", price=" + price +
                ", status='" + status + '\'';
    }
}
