package com.example.fivestarhotel.FinalProject_MahbubAlam_2221100.Hotel;

import javafx.scene.control.Button;

public class HotelViewRowSetting {
    private String hotelName;
    private int averageRoomPrice;
    private String availabilityStatus;
    private String location;
    private Button actionButton;

    public HotelViewRowSetting(Hotel hotelInfo) {
        this.hotelName = hotelInfo.getHotelName();
        this.averageRoomPrice = hotelInfo.getAverageRoomPrice();
        this.availabilityStatus = hotelInfo.getAvailabilityStatus();
        this.location = hotelInfo.getLocation();
        this.actionButton = new Button("View Rate");
    }

    public String getHotelName() {
        return hotelName;
    }

    public int getAverageRoomPrice() {
        return averageRoomPrice;
    }

    public String getAvailabilityStatus() {
        return availabilityStatus;
    }

    public String getLocation() {
        return location;
    }

    public Button getActionButton() {
        return actionButton;
    }
}
