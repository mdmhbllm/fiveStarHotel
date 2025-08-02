package cse213.final_project_2231379;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class TrainingSession {
    private String sessionId;
    private String topic;
    private LocalDate date;
    private LocalTime time;
    private String venue;
    private Staff trainer;
    private List<Staff> attendees;


    public TrainingSession(String sessionId, String topic, LocalDate date, LocalTime time, String venue, Staff trainer, List<Staff> attendees) {
        this.sessionId = sessionId;
        this.topic = topic;
        this.date = date;
        this.time = time;
        this.venue = venue;
        this.trainer = trainer;
        this.attendees = attendees;
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

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public Staff getTrainer() {
        return trainer;
    }

    public void setTrainer(Staff trainer) {
        this.trainer = trainer;
    }

    public List<Staff> getAttendees() {
        return attendees;
    }

    public void setAttendees(List<Staff> attendees) {
        this.attendees = attendees;
    }

    @Override
    public String toString() {
        return "TrainingSession{" +
                "sessionId='" + sessionId + '\'' +
                ", topic='" + topic + '\'' +
                ", date=" + date +
                ", time=" + time +
                ", venue='" + venue + '\'' +
                ", trainer=" + trainer +
                ", attendees=" + attendees +
                '}';
    }
}
