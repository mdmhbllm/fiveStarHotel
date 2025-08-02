package cse213.final_project_2231379;

import java.time.LocalDate;

public class TraringRequest {
    private String requestId;
    private String  employeeName;
    private String trainingTitle;
    private LocalDate date;
    private String status;
    private String rejectionReason;

    public TraringRequest(String requestId, String employeeName, String trainingTitle, LocalDate date, String status, String rejectionReason) {
        this.requestId = requestId;
        this.employeeName = employeeName;
        this.trainingTitle = trainingTitle;
        this.date = date;
        this.status = status;
        this.rejectionReason = rejectionReason;
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

    public String getRejectionReason() {
        return rejectionReason;
    }

    public void setRejectionReason(String rejectionReason) {
        this.rejectionReason = rejectionReason;
    }

    @Override
    public String toString() {
        return "TraringRequest{" +
                "requestId='" + requestId + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", trainingTitle='" + trainingTitle + '\'' +
                ", date=" + date +
                ", status='" + status + '\'' +
                ", rejectionReason='" + rejectionReason + '\'' +
                '}';
    }
}
