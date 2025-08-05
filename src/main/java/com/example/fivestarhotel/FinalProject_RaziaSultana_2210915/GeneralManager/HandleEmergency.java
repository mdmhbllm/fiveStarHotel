package com.example.fivestarhotel.FinalProject_RaziaSultana_2210915.GeneralManager;

import java.time.LocalDate;

public class HandleEmergency {
    private String incidentId,incidentType,status,incidentDetails,severity,time;
    private LocalDate date;

    public HandleEmergency(String incidentId, String incidentType, String status, String incidentDetails, String severity, String time, LocalDate date) {
        this.incidentId = incidentId;
        this.incidentType = incidentType;
        this.status = status;
        this.incidentDetails = incidentDetails;
        this.severity = severity;
        this.time = time;
        this.date = date;
    }

    public String getIncidentId() {
        return incidentId;
    }

    public void setIncidentId(String incidentId) {
        this.incidentId = incidentId;
    }

    public String getIncidentType() {
        return incidentType;
    }

    public void setIncidentType(String incidentType) {
        this.incidentType = incidentType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIncidentDetails() {
        return incidentDetails;
    }

    public void setIncidentDetails(String incidentDetails) {
        this.incidentDetails = incidentDetails;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "HandleEmergency{" +
                "incidentId='" + incidentId + '\'' +
                ", incidentType='" + incidentType + '\'' +
                ", status='" + status + '\'' +
                ", incidentDetails='" + incidentDetails + '\'' +
                ", severity='" + severity + '\'' +
                ", time='" + time + '\'' +
                ", date=" + date +
                '}';
    }
}
