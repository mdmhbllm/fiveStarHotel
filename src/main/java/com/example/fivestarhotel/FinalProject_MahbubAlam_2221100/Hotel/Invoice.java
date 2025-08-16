package com.example.fivestarhotel.FinalProject_MahbubAlam_2221100.Hotel;

import java.io.Serializable;
import java.time.LocalDate;

public class Invoice implements Serializable {
    private String invoiceNumber;
    private String bookingId;
    private String guestName;
    private String roomNumber;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private double totalPrice;

    public Invoice(String invoiceNumber, String bookingId, String guestName, String roomNumber, LocalDate checkInDate, LocalDate checkOutDate, double totalPrice) {
        this.invoiceNumber = invoiceNumber;
        this.bookingId = bookingId;
        this.guestName = guestName;
        this.roomNumber = roomNumber;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.totalPrice = totalPrice;
        this.invoiceNumber = generateInvoiceNumber();
    }

    private String generateInvoiceNumber() {
        int randomNum = 100000 + (int)(Math.random() * 900000);
        return "INV" + randomNum;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
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

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceNumber='" + invoiceNumber + '\'' +
                ", bookingId='" + bookingId + '\'' +
                ", guestName='" + guestName + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                ", checkInDate=" + checkInDate +
                ", checkOutDate=" + checkOutDate +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
