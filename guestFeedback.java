package com.example.fivestarthotel.GeneralManager;

public class guestFeedback {
    private String guestID,guestName,roomNumber,guestType,feedbackComments;
    private Double rating;

    public guestFeedback(String guestID, String guestName, String roomNumber, String guestType, String feedbackComments, double rating) {
        this.guestID = guestID;
        this.guestName = guestName;
        this.roomNumber = roomNumber;
        this.guestType = guestType;
        this.feedbackComments = feedbackComments;
        this.rating = rating;
    }

    public String getGuestID() {
        return guestID;
    }

    public void setGuestID(String guestID) {
        this.guestID = guestID;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
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

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "guestFeedback{" +
                "guestID='" + guestID + '\'' +
                ", guestName='" + guestName + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                ", guestType='" + guestType + '\'' +
                ", feedbackComments='" + feedbackComments + '\'' +
                ", rating=" + rating +
                '}';
    }
}
