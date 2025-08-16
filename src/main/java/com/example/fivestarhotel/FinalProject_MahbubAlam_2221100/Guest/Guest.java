package com.example.fivestarhotel.FinalProject_MahbubAlam_2221100.Guest;

import com.example.fivestarhotel.FinalProject_MahbubAlam_2221100.Hotel.Booking;
import com.example.fivestarhotel.FinalProject_MahbubAlam_2221100.User.User;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Guest extends User implements Serializable {
    private String address;
    private String country;
    private String zipCode;
    private String city;
    private boolean isRegistered;;
    private List<Booking> bookings = new ArrayList<>();

    public Guest(String name, String email, String password, String phoneNumber, String userType,
                 String address, String country, String zipCode, String city) {
        super(name, email, password, phoneNumber, generateMemberId(), userType);
        this.address = address;
        this.country = country;
        this.zipCode = zipCode;
        this.city = city;
        this.isRegistered = true;
    }

    public Guest(String name, String email, String phoneNumber,
                 String address, String country, String zipCode, String city) {
        super(name, email, null, phoneNumber, generateMemberId(), "UnregisteredGuest");
        this.address = address;
        this.country = country;
        this.zipCode = zipCode;
        this.city = city;
        this.isRegistered = false;
    }

    public Guest(String name, String email, String password, String phoneNumber, String userId, String userType,
                 String address, String country, String zipCode, String city) {
        super(name, email, password, phoneNumber, userId, userType);
        this.address = address;
        this.country = country;
        this.zipCode = zipCode;
        this.city = city;
        this.isRegistered = true;
    }

    @Override
    public boolean login(String userId, String password) {
        return this.getUserId().equals(userId) && this.getPassword().equals(password);
    }

    @Override
    public void logout() {
        System.out.println("Guest logged out.");
    }

    @Override
    public void viewDashBoard() {
        System.out.println("Showing Guest Dashboard.");
    }

    @Override
    public boolean changePassword(String oldPassword, String newPassword, String confirmPassword) {
        if (this.getPassword().equals(oldPassword) && newPassword.equals(confirmPassword)) {
            this.setPassword(newPassword);
            return true;
        }
        return false;
    }

    @Override
    public void updateProfile(String newEmail, String newPhone) {
        this.phoneNumber = newPhone;
        this.email = newEmail;
    }


    private static String generateMemberId() {
        Random random = new Random();
        int randomNumber = 100000 + random.nextInt(900000);
        return "ABC" + randomNumber;
    }
    
    public void addBooking(Booking booking) {
        if (booking != null) {
            bookings.add(booking);
            System.out.println("Booking added for guest: ");
        } else {
            System.out.println("Cannot add null booking.");
        }
    }

    public void cancelBooking(Booking booking) {
        if (booking != null && bookings.contains(booking)) {
            bookings.remove(booking);
            System.out.println("Booking cancelled for guest: " + this.getName());
        } else {
            System.out.println("Booking not found for cancellation.");
        }
    }

    public String viewBookingDetails(Booking booking){
        return booking.toString();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isRegistered() {
        return isRegistered;
    }

    public void setRegistered(boolean registered) {
        isRegistered = registered;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }
}
