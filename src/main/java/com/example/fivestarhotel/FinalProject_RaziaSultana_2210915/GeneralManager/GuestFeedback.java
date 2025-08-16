package com.example.fivestarhotel.FinalProject_RaziaSultana_2210915.GeneralManager;

public class GuestFeedback {
    private Integer feedbackId;
    private Integer guestId;
    private String guestName;
    private String roomNo;
    private String guestType;
    private String feedbackComments;
    private Float starRating;

    public GuestFeedback(Integer feedbackId, Integer guestId, String guestName, String roomNo, String guestType, String feedbackComments, Float starRating) {
        this.feedbackId = feedbackId;
        this.guestId = guestId;
        this.guestName = guestName;
        this.roomNo = roomNo;
        this.guestType = guestType;
        this.feedbackComments = feedbackComments;
        this.starRating = starRating;
    }

    public Integer getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(Integer feedbackId) {
        this.feedbackId = feedbackId;
    }

    public Integer getGuestId() {
        return guestId;
    }

    public void setGuestId(Integer guestId) {
        this.guestId = guestId;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public String getGuestType() {
        return guestType;
    }

    public void setGuestType(String guestType) {
        this.guestType = guestType;
    }

    public String getFeedbackComments() {
        return feedbackComments;
    }

    public void setFeedbackComments(String feedbackComments) {
        this.feedbackComments = feedbackComments;
    }

    public Float getStarRating() {
        return starRating;
    }

    public void setStarRating(Float starRating) {
        this.starRating = starRating;
    }

    @Override
    public String toString() {
        return "GuestFeedback{" +
                "feedbackId=" + feedbackId +
                ", guestId=" + guestId +
                ", guestName='" + guestName + '\'' +
                ", roomNo='" + roomNo + '\'' +
                ", guestType='" + guestType + '\'' +
                ", feedbackComments='" + feedbackComments + '\'' +
                ", starRating=" + starRating +
                '}';
    }
}
