package com.example.fivestarthotel.FinalProject_RaziaSultana_2210915.GeneralManager;

import java.time.LocalDate;

public class manageMarketing {
    private String campiagnName,status,targetAudience;
    private Double budget;
    private LocalDate date;

    public manageMarketing(String campiagnName, String status, String targetAudience, Double budget, LocalDate date) {
        this.campiagnName = campiagnName;
        this.status = status;
        this.targetAudience = targetAudience;
        this.budget = budget;
        this.date = date;
    }

    public String getCampiagnName() {
        return campiagnName;
    }

    public void setCampiagnName(String campiagnName) {
        this.campiagnName = campiagnName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTargetAudience() {
        return targetAudience;
    }

    public void setTargetAudience(String targetAudience) {
        this.targetAudience = targetAudience;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "manageMarketing{" +
                "campiagnName='" + campiagnName + '\'' +
                ", status='" + status + '\'' +
                ", targetAudience='" + targetAudience + '\'' +
                ", budget=" + budget +
                ", date=" + date +
                '}';
    }
}
