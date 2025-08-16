package com.example.fivestarhotel.FinalProject_MahbubAlam_2221100.Guest;

import com.example.fivestarhotel.FinalProject_MahbubAlam_2221100.Hotel.Booking;

import java.time.LocalDateTime;
import java.util.UUID;

public class CheckOutProcess {
    private String checkOutId;
    private Guest guest;
    private Booking booking;
    private LocalDateTime checkOutTime;
    private double pendingCharges;

    public CheckOutProcess(Guest guest, Booking booking) {
        this.checkOutId = generateCheckOutId();
        this.guest = guest;
        this.booking = booking;
        this.checkOutTime = null;
        this.pendingCharges = 0.0;
    }

    // Generates a unique checkout ID
    private static String generateCheckOutId() {
        int randomNum = 100000 + (int)(Math.random() * 900000);
        return "CHKOUT" + randomNum;
    }


    public boolean processCheckOut() {
        if (guest == null || booking == null) {
            return false;
        }
        this.pendingCharges = calculateCharges();
        this.checkOutTime = LocalDateTime.now();
        updateRoomAvailability();
        return true;
    }

    public double calculateCharges() {
        return booking.getTotalPrice();
    }

    public void updateRoomAvailability() {
        if (booking != null && booking.getBookingId() != null) {
            booking.markAsAvailable();
        }
    }


    public String getCheckOutId() {
        return checkOutId;
    }

    public Guest getGuest() {
        return guest;
    }

    public Booking getBooking() {
        return booking;
    }

    public LocalDateTime getCheckOutTime() {
        return checkOutTime;
    }

    public double getPendingCharges() {
        return pendingCharges;
    }
}
