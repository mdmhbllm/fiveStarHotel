package com.example.fivestarhotel.FinalProject_UdoyRoy_2231379;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

public class Reservation  implements Serializable {
    private String guest;
    private LocalDate date;
    private String time;
    private int partySize;
    private String table;
    private String specialRequest;
    private String status;
    private int Capacity;

    public Reservation(String guest, LocalDate date, String time, int partySize, String table, String specialRequest, String status, int capacity) {
        this.guest = guest;
        this.date = date;
        this.time = time;
        this.partySize = partySize;
        this.table = table;
        this.specialRequest = specialRequest;
        this.status = status;
        Capacity = capacity;
    }

    public String getGuest() {
        return guest;
    }

    public void setGuest(String guest) {
        this.guest = guest;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getPartySize() {
        return partySize;
    }

    public void setPartySize(int partySize) {
        this.partySize = partySize;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
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

    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int capacity) {
        Capacity = capacity;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "guest='" + guest + '\'' +
                ", date=" + date +
                ", time='" + time + '\'' +
                ", partySize=" + partySize +
                ", table='" + table + '\'' +
                ", specialRequest='" + specialRequest + '\'' +
                ", status='" + status + '\'' +
                ", Capacity=" + Capacity +
                '}';
    }
}
