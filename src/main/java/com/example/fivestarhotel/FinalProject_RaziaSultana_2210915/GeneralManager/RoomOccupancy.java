package com.example.fivestarhotel.FinalProject_RaziaSultana_2210915.GeneralManager;

import java.time.LocalDate;

public class RoomOccupancy {
    private String RoomType,roomNumber;
    private Double upcomingBookings,averageDailyRate,availableRooms;
    private LocalDate date;

    public RoomOccupancy(String roomType, String roomNumber, Double upcomingBookings, Double averageDailyRate, Double availableRooms, LocalDate date) {
        RoomType = roomType;
        this.roomNumber = roomNumber;
        this.upcomingBookings = upcomingBookings;
        this.averageDailyRate = averageDailyRate;
        this.availableRooms = availableRooms;
        this.date = date;
    }

    public String getRoomType() {
        return RoomType;
    }

    public void setRoomType(String roomType) {
        RoomType = roomType;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Double getUpcomingBookings() {
        return upcomingBookings;
    }

    public void setUpcomingBookings(Double upcomingBookings) {
        this.upcomingBookings = upcomingBookings;
    }

    public Double getAverageDailyRate() {
        return averageDailyRate;
    }

    public void setAverageDailyRate(Double averageDailyRate) {
        this.averageDailyRate = averageDailyRate;
    }

    public Double getAvailableRooms() {
        return availableRooms;
    }

    public void setAvailableRooms(Double availableRooms) {
        this.availableRooms = availableRooms;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "RoomOccupancy{" +
                "RoomType='" + RoomType + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                ", upcomingBookings=" + upcomingBookings +
                ", averageDailyRate=" + averageDailyRate +
                ", availableRooms=" + availableRooms +
                ", date=" + date +
                '}';
    }
}
