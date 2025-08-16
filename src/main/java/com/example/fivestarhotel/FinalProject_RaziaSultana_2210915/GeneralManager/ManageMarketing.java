package com.example.fivestarhotel.FinalProject_RaziaSultana_2210915.GeneralManager;

import java.time.LocalDate;

public class ManageMarketing {
    private String campaignName;
    private double budget;
    private String targetAudience;
    private LocalDate startDate;
    private LocalDate endDate;
    private String campaignStatus;

    public ManageMarketing(String campaignName, double budget, String targetAudience, LocalDate startDate, LocalDate endDate, String campaignStatus) {
        this.campaignName = campaignName;
        this.budget = budget;
        this.targetAudience = targetAudience;
        this.startDate = startDate;
        this.endDate = endDate;
        this.campaignStatus = campaignStatus;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public String getTargetAudience() {
        return targetAudience;
    }

    public void setTargetAudience(String targetAudience) {
        this.targetAudience = targetAudience;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getCampaignStatus() {
        return campaignStatus;
    }

    public void setCampaignStatus(String campaignStatus) {
        this.campaignStatus = campaignStatus;
    }

    @Override
    public String toString() {
        return "ManageMarketing{" +
                "campaignName='" + campaignName + '\'' +
                ", budget=" + budget +
                ", targetAudience='" + targetAudience + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", campaignStatus='" + campaignStatus + '\'' +
                '}';
    }
}
