package com.example.fivestarthotel.FinalProject_UdoyRoy_2231379;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reservation {
    private String guestID;
    private Reservation guest;
    private LocalDate date;
    private LocalTime time;
    private int partySize;
    private Table table;
    private String specialRequest;
    private String status;
    private int Capacity;

    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int capacity) {
        Capacity = capacity;
    }

    public Reservation(int capacity) {
        Capacity = capacity;
    }

    public Reservation(String guestID, Reservation guest, LocalDate date, LocalTime time, int partySize, Table table, String specialRequest, String status) {
        this.guestID = guestID;
        this.guest = guest;
        this.date = date;
        this.time = time;
        this.partySize = partySize;
        this.table = table;
        this.specialRequest = specialRequest;
        this.status = status;
    }

    public String getGuestID() {
        return guestID;
    }

    public void setGuestID(String guestID) {
        this.guestID = guestID;
    }

    public Reservation getGuest() {
        return guest;
    }

    public void setGuest(Reservation guest) {
        this.guest = guest;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public int getPartySize() {
        return partySize;
    }

    public void setPartySize(int partySize) {
        this.partySize = partySize;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public String getSpecialRequest() {
        return specialRequest;
    }

    public void setSpecialRequest(String specialRequest) {
        this.specialRequest = specialRequest;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "guestID='" + guestID + '\'' +
                ", guest=" + guest +
                ", date=" + date +
                ", time=" + time +
                ", partySize=" + partySize +
                ", table=" + table +
                ", specialRequest='" + specialRequest + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
