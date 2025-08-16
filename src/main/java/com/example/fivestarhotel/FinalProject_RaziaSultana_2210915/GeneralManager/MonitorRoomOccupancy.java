package com.example.fivestarhotel.FinalProject_RaziaSultana_2210915.GeneralManager;

public class MonitorRoomOccupancy {
    private String roomNumber;
    private String roomType;
    private int upcomingBookingsForecast;
    private int availableRooms;
    private double averageDailyRate;

    public MonitorRoomOccupancy(String roomNumber, String roomType, int upcomingBookingsForecast, int availableRooms, double averageDailyRate) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.upcomingBookingsForecast = upcomingBookingsForecast;
        this.availableRooms = availableRooms;
        this.averageDailyRate = averageDailyRate;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getUpcomingBookingsForecast() {
        return upcomingBookingsForecast;
    }

    public void setUpcomingBookingsForecast(int upcomingBookingsForecast) {
        this.upcomingBookingsForecast = upcomingBookingsForecast;
    }

    public int getAvailableRooms() {
        return availableRooms;
    }

    public void setAvailableRooms(int availableRooms) {
        this.availableRooms = availableRooms;
    }

    public double getAverageDailyRate() {
        return averageDailyRate;
    }

    public void setAverageDailyRate(double averageDailyRate) {
        this.averageDailyRate = averageDailyRate;
    }

    @Override
    public String toString() {
        return "MonitorRoomOccupancy{" +
                "roomNumber='" + roomNumber + '\'' +
                ", roomType='" + roomType + '\'' +
                ", upcomingBookingsForecast=" + upcomingBookingsForecast +
                ", availableRooms=" + availableRooms +
                ", averageDailyRate=" + averageDailyRate +
                '}';
    }
}
