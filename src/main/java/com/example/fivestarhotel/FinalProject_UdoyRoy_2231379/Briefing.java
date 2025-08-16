package com.example.fivestarhotel.FinalProject_UdoyRoy_2231379;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

public class Briefing implements Serializable {
    private LocalDate date;
    private String time;
    private String agenda;
    private String location;

    public Briefing(LocalDate date, String time, String agenda, String location) {
        this.date = date;
        this.time = time;
        this.agenda = agenda;
        this.location = location;
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
                "date=" + date +
                ", time='" + time + '\'' +
                ", agenda='" + agenda + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
