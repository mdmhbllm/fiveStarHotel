package com.example.fivestarhotel.FinalProject_MahbubAlam_2221100.Hotel;

import com.example.fivestarhotel.FinalProject_MahbubAlam_2221100.Guest.Guest;

import java.io.Serializable;
import java.time.LocalDate;

public class Booking implements Serializable{
    private String bookingId;
    private Guest guest;
    private String roomID;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private String numberOfGuest;
    private int numberOfRoom;
    private String status;
    private double roomPrice;
    private double totalPrice;

    public Booking(Guest guest, String roomID, LocalDate checkInDate, LocalDate checkOutDate,
                   String numberOfGuest, int numberOfRoom, String status,Double roomPrice) {
        this.bookingId = generateBookingId();
        this.guest = guest;
        this.roomID = roomID;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.numberOfGuest = numberOfGuest;
        this.numberOfRoom = numberOfRoom;
        this.status = status;
        this.roomPrice = roomPrice;
        this.totalPrice = calculateTotalPrice();
    }


    public double calculateTotalPrice() {
        int checkInDay = checkInDate.getDayOfMonth();
        int checkOutDay = checkOutDate.getDayOfMonth();

        int days = checkOutDay - checkInDay;

        if (days <= 0) {
            days = 1;
        }


        double total = days * this.roomPrice * numberOfRoom;
        this.totalPrice = total;
        return total;
    }


    private static String generateBookingId() {
        int randomNum = 100000 + (int)(Math.random() * 900000);
        return "BK" + randomNum;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(LocalDate checkInDate) {
        this.checkInDate = checkInDate;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(LocalDate checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public String getNumberOfGuest() {
        return numberOfGuest;
    }

    public void setNumberOfGuest(String numberOfGuest) {
        this.numberOfGuest = numberOfGuest;
    }

    public int getNumberOfRoom() {
        return numberOfRoom;
    }

    public void setNumberOfRoom(int numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(double roomPrice) {
        this.roomPrice = roomPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void markAsAvailable() {
        this.status = "Available";
    }

    public void markAsBooked() {
        this.status = "Booked";
    }
}
