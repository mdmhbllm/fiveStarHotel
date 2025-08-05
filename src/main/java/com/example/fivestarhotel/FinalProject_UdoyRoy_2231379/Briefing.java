package com.example.fivestarhotel.FinalProject_UdoyRoy_2231379;

import java.time.LocalDate;
import java.time.LocalTime;

public class Briefing {
    private String briefingId;
    private LocalDate date;
    private LocalTime time;
    private String agenda;
    private String location;

    public Briefing(String briefingId, LocalDate date, LocalTime time, String agenda, String location) {
        this.briefingId = briefingId;
        this.date = date;
        this.time = time;
        this.agenda = agenda;
        this.location = location;
    }

    public String getBriefingId() {
        return briefingId;
    }

    public void setBriefingId(String briefingId) {
        this.briefingId = briefingId;
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

    public String getAgenda() {
        return agenda;
    }

    public void setAgenda(String agenda) {
        this.agenda = agenda;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Briefing{" +
                "briefingId='" + briefingId + '\'' +
                ", date=" + date +
                ", time=" + time +
                ", agenda='" + agenda + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
