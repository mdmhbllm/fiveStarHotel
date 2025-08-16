package com.example.fivestarhotel.FinalProject_MahbubAlam_2221100.Hotel;

import java.io.Serializable;

public class Hotel implements Serializable {
        private String hotelName;
        private int averageRoomPrice;
        private String availabilityStatus;
        private String location;

    public Hotel(String hotelName, int averageRoomPrice, String availabilityStatus, String location) {
        this.hotelName = hotelName;
        this.averageRoomPrice = averageRoomPrice;
        this.availabilityStatus = availabilityStatus;
        this.location = location;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getAverageRoomPrice() {
        return averageRoomPrice;
    }

    public void setAverageRoomPrice(int averageRoomPrice) {
        this.averageRoomPrice = averageRoomPrice;
    }

    public String getAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(String availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
        public String toString() {
            return "HotelInformation{" +
                    "hotelName='" + hotelName + '\'' +
                    ", averageRoomPrice=" + averageRoomPrice +
                    ", availabilityStatus='" + availabilityStatus + '\'' +
                    ", location='" + location + '\'' +
                    '}';
        }


        public void markAsBooked() {
            this.availabilityStatus = "Booked";
        }

        public void markAsAvailable() {
            this.availabilityStatus = "Available";
        }

}
