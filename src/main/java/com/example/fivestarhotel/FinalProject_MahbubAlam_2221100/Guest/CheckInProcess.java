package com.example.fivestarhotel.FinalProject_MahbubAlam_2221100.Guest;

import com.example.fivestarhotel.FinalProject_MahbubAlam_2221100.Hotel.Booking;

import java.time.LocalDateTime;

public class CheckInProcess {
    private String checkInId;
    private Guest guest;
    private Booking booking;
    private LocalDateTime checkInTime;

    public CheckInProcess(String checkInId, Guest guest, Booking booking) {
        this.checkInId = generateCheckInId();
        this.guest = guest;
        this.booking = booking;
        this.checkInTime = null;
    }


    public boolean verifyGuest() {
        if (guest == null || booking == null) {
            return false;
        }
        return guest.getUserId().equals(booking.getGuest().getUserId());
    }

    public boolean confirmCheckIn() {
        if (verifyGuest() && booking != null) {
            this.checkInTime = LocalDateTime.now();
            updateRoomStatus();
            return true;
        }
        return false;
    }

    public void updateRoomStatus() {
        if (booking != null && booking.getBookingId() != null) {
            booking.markAsBooked();
        }
    }
    private static String generateCheckInId() {
        int randomNum = 100000 + (int)(Math.random() * 900000);
        return "CHKIN" + randomNum;
    }

    public String getCheckInId() {
        return checkInId;
    }

    public Guest getGuest() {
        return guest;
    }

    public Booking getBooking() {
        return booking;
    }

    public LocalDateTime getCheckInTime() {
        return checkInTime;
    }
}
