package com.example.fivestarhotel.FinalProject_UdoyRoy_2231379;

import java.io.Serializable;
import java.time.LocalDate;

public class Feedback implements Serializable {
    private String feedbackId;
    private String guestName;
    private LocalDate submissionDate;
    private int rating;
    private String feedbackText;
    private String status;

    public Feedback(String feedbackId, String guestName, LocalDate submissionDate, int rating, String feedbackText, String status) {
        this.feedbackId = feedbackId;
        this.guestName = guestName;
        this.submissionDate = submissionDate;
        this.rating = rating;
        this.feedbackText = feedbackText;
        this.status = status;
    }

    public String getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(String feedbackId) {
        this.feedbackId = feedbackId;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public LocalDate getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(LocalDate submissionDate) {
        this.submissionDate = submissionDate;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getFeedbackText() {
        return feedbackText;
    }

    public void setFeedbackText(String feedbackText) {
        this.feedbackText = feedbackText;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "feedbackId='" + feedbackId + '\'' +
                ", guestName='" + guestName + '\'' +
                ", submissionDate=" + submissionDate +
                ", rating=" + rating +
                ", feedbackText='" + feedbackText + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
