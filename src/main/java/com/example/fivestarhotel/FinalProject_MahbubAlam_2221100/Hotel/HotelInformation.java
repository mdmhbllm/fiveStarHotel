package com.example.fivestarhotel.FinalProject_MahbubAlam_2221100.Hotel;

public class HotelInformation {
    private String hotelName;
    private int averageRoomPrice;
    private String availabilityStatus;

    public HotelInformation(String hotelName, int averageRoomPrice, String availabilityStatus) {
        this.hotelName = hotelName;
        this.averageRoomPrice = averageRoomPrice;
        this.availabilityStatus = availabilityStatus;
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

    @Override
    public String toString() {
        return "HotelInformation{" +
                "hotelName='" + hotelName + '\'' +
                ", averageRoomPrice='" + averageRoomPrice + '\'' +
                ", availabilityStatus='" + availabilityStatus + '\'' +
                '}';
    }
}
