package com.example.fivestarhotel.FinalProject_RaziaSultana_2210915.GeneralManager;

import javafx.beans.property.StringProperty;

import java.time.LocalDateTime;

public class ManageEmergencies {
    private  String incidentId;
    private LocalDateTime dateTime;
    private String  type;
    private String  severity;
    private String  status;

    public ManageEmergencies(String incidentId, LocalDateTime dateTime, String type, String severity, String status) {
        this.incidentId = incidentId;
        this.dateTime = dateTime;
        this.type = type;
        this.severity = severity;
        this.status = status;
    }

    public String getIncidentId() {
        return incidentId;
    }

    public void setIncidentId(String incidentId) {
        this.incidentId = incidentId;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ManageEmergencies{" +
                "incidentId='" + incidentId + '\'' +
                ", dateTime=" + dateTime +
                ", type='" + type + '\'' +
                ", severity='" + severity + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
