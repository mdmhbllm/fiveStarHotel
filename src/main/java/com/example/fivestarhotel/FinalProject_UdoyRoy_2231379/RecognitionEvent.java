package com.example.fivestarhotel.FinalProject_UdoyRoy_2231379;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

public class RecognitionEvent implements Serializable {
    private String eventName;
    private LocalDate date;
    private LocalTime time;
    private String location;
    private String purpose;

    public RecognitionEvent(String eventName, LocalDate date, LocalTime time, String location, String purpose) {
        this.eventName = eventName;
        this.date = date;
        this.time = time;
        this.location = location;
        this.purpose = purpose;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @Override
    public String toString() {
        return "RecognitionEvent{" +
                "eventName='" + eventName + '\'' +
                ", date=" + date +
                ", time=" + time +
                ", location='" + location + '\'' +
                ", purpose='" + purpose + '\'' +
                '}';
    }
}
