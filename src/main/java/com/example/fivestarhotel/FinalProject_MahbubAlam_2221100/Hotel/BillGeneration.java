package com.example.fivestarhotel.FinalProject_MahbubAlam_2221100.Hotel;

import com.example.fivestarhotel.FinalProject_MahbubAlam_2221100.Guest.Guest;

import java.io.File;

public class BillGeneration {
    private String billId;
    private Guest guest;
    private double totalAmount;

    public BillGeneration(String billId, Guest guest, double totalAmount) {
        this.billId = generateBillId();
        this.guest = guest;
        this.totalAmount = totalAmount;
    }

    public BillGeneration generateBill() {
        return this;
    }

    private static String generateBillId() {
        int randomNum = 100000 + (int)(Math.random() * 900000);
        return "Bill" + randomNum;
    }


//    public File exportToPDF() {
//        ;
//    }

    // Getters and setters

    public String getBillId() {
        return billId;
    }

    public Guest getGuest() {
        return guest;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
