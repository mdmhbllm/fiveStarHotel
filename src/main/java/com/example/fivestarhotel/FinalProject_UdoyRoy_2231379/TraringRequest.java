package com.example.fivestarhotel.FinalProject_UdoyRoy_2231379;

import java.io.Serializable;
import java.time.LocalDate;

public class TraringRequest implements Serializable {

    private String requestId;
    private String  employeeName;
    private String trainingTitle;
    private LocalDate date;
    private String status;
    private String type;

    public TraringRequest(String requestId, String employeeName, String trainingTitle, LocalDate date, String status, String type) {
        this.requestId = requestId;
        this.employeeName = employeeName;
        this.trainingTitle = trainingTitle;
        this.date = date;
        this.status = status;
        this.type = type;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getTrainingTitle() {
        return trainingTitle;
    }

    public void setTrainingTitle(String trainingTitle) {
        this.trainingTitle = trainingTitle;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "TraringRequest{" +
                "requestId='" + requestId + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", trainingTitle='" + trainingTitle + '\'' +
                ", date=" + date +
                ", status='" + status + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
