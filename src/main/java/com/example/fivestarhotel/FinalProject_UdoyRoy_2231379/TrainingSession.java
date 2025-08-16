package com.example.fivestarhotel.FinalProject_UdoyRoy_2231379;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class TrainingSession {
    private String sessionId;
    private String topic;
    private LocalDate date;
    private String time;
    private String venue;
    private String trainer;


    public TrainingSession(String sessionId, String topic, LocalDate date, String time, String venue, String trainer) {
        this.sessionId = sessionId;
        this.topic = topic;
        this.date = date;
        this.time = time;
        this.venue = venue;
        this.trainer = trainer;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
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

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    @Override
    public String toString() {
        return "TrainingSession{" +
                "sessionId='" + sessionId + '\'' +
                ", topic='" + topic + '\'' +
                ", date=" + date +
                ", time='" + time + '\'' +
                ", venue='" + venue + '\'' +
                ", trainer='" + trainer + '\'' +
                '}';
    }
}
