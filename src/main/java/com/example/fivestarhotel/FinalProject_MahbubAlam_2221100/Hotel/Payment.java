package com.example.fivestarhotel.FinalProject_MahbubAlam_2221100.Hotel;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Payment implements Serializable {
    private Booking booking;
    private double amount;
    private String method;
    private String cardNumber;
    private String cardHolderName;
    private int expiryMonth;
    private int expiryYear;
    private String status;
    private LocalDateTime paymentDate;
    private String transactionId;

    public Payment(Booking booking, double amount, String method, String cardNumber,
                   String cardHolderName, int expiryMonth, int expiryYear) {
        this.booking = booking;
        this.amount = amount;
        this.method = method;
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expiryMonth = expiryMonth;
        this.expiryYear = expiryYear;
        this.status = "Pending";
        this.paymentDate = null;
        this.transactionId = null;
    }

    public boolean processPayment() {
        if (!validateCardDetails()) {
            System.out.println("Card details invalid.");
            this.status = "Failed";
            return false;
        }

        this.transactionId = generateTransactionId();
        this.paymentDate = LocalDateTime.now();
        this.status = "Completed";
        sendPaymentConfirmation();
        return true;
    }

    public boolean validateCardDetails() {
        if (cardNumber == null) {
            return false;
        } else if (!cardNumber.matches("\\d{16}")) {
            return false;
        } else return cardHolderName != null;



    }

    public String generateTransactionId() {
        int randomNum = 100000 + (int)(Math.random() * 900000);
        return "TXN" + randomNum;
    }

    public void sendPaymentConfirmation() {
        System.out.println("Payment confirmation sent for transaction " + transactionId);
    }

    public Booking getBooking() {
        return booking;
    }

    public double getAmount() {
        return amount;
    }

    public String getMethod() {
        return method;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public int getExpiryMonth() {
        return expiryMonth;
    }

    public void setExpiryMonth(int expiryMonth) {
        this.expiryMonth = expiryMonth;
    }

    public int getExpiryYear() {
        return expiryYear;
    }

    public void setExpiryYear(int expiryYear) {
        this.expiryYear = expiryYear;
    }

    public String getStatus() {
        return status;
    }

    public LocalDateTime getPaymentDate() {
        return paymentDate;
    }

    public String getTransactionId() {
        return transactionId;
    }
}
