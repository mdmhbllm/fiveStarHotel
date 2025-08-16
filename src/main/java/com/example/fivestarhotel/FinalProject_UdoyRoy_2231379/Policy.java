package com.example.fivestarhotel.FinalProject_UdoyRoy_2231379;

import java.io.Serializable;
import java.time.LocalDate;

public class Policy implements Serializable {
    private String policyId;
    private String title;
    private String message;
    private LocalDate dateSent;

    public Policy(String policyId, String title, String message, LocalDate dateSent) {
        this.policyId = policyId;
        this.title = title;
        this.message = message;

        this.dateSent = dateSent;
    }

    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public LocalDate getDateSent() {
        return dateSent;
    }

    public void setDateSent(LocalDate dateSent) {
        this.dateSent = dateSent;
    }

    @Override
    public String toString() {
        return "Policy{" +
                "policyId='" + policyId + '\'' +
                ", title='" + title + '\'' +
                ", message='" + message + '\'' +
                ", dateSent=" + dateSent +
                '}';
    }
}
