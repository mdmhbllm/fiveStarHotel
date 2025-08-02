package com.example.fivestarthotel.FinalProject_UdoyRoy_2231379;

import java.time.LocalDate;

public class SpecialOffer {
    private int offerId;
    private String title;
    private String description;
    private LocalDate validUntil;

    public SpecialOffer(int offerId, String title, String description, LocalDate validUntil) {
        this.offerId = offerId;
        this.title = title;
        this.description = description;
        this.validUntil = validUntil;
    }

    public int getOfferId() {
        return offerId;
    }

    public void setOfferId(int offerId) {
        this.offerId = offerId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(LocalDate validUntil) {
        this.validUntil = validUntil;
    }

    @Override
    public String toString() {
        return "SpecialOffer{" +
                "offerId=" + offerId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", validUntil=" + validUntil +
                '}';
    }
}
