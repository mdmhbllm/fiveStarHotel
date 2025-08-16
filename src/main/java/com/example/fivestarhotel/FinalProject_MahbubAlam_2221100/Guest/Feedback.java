package com.example.fivestarhotel.FinalProject_MahbubAlam_2221100.Guest;
import com.example.fivestarhotel.FinalProject_MahbubAlam_2221100.Hotel.Booking;

import java.time.LocalDateTime;

public class Feedback {
    private String feedbackId;
    private Guest guest;
    private Booking booking;
    private int rating;
    private String comment;
    private LocalDateTime feedbackDate;

    public Feedback(String feedbackId, Guest guest, Booking booking, int rating, String comment, LocalDateTime feedbackDate) {
        this.feedbackId = feedbackId;
        this.guest = guest;
        this.booking = booking;
        this.rating = rating;
        this.comment = comment;
        this.feedbackDate = feedbackDate;
    }

    public static Feedback submitFeedback(Guest guest, Booking booking, int rating, String comment, LocalDateTime feedbackDate) {
        String feedbackId = generateFeedbackId();
        return new Feedback(feedbackId, guest, booking, rating, comment, feedbackDate);
    }

    private static String generateFeedbackId() {
        int randomNum = 100000 + (int)(Math.random() * 900000);
        return "FDBK" + randomNum;
    }


    public String getFeedbackId() {
        return feedbackId;
    }

    public Guest getGuest() {
        return guest;
    }

    public Booking getBooking() {
        return booking;
    }

    public int getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }

    public LocalDateTime getFeedbackDate() {
        return feedbackDate;
    }
}
