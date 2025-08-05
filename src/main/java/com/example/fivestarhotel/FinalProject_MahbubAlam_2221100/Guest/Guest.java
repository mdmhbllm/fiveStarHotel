package com.example.fivestarhotel.FinalProject_MahbubAlam_2221100.Guest;

import com.example.fivestarhotel.User;

public class Guest extends User {
    private String address;
    private String country;
    private String zipCode;
    private String city;
    private boolean isRegistered;
    private String membershipId;

    public Guest(String name, String email, String password, String phoneNumber, String userId, String userType,
                 String address, String country, String zipCode, String city) {
        super(name, email, password, phoneNumber, userId, userType);
        this.address = address;
        this.country = country;
        this.zipCode = zipCode;
        this.city = city;
        this.isRegistered = false;
        this.membershipId = generateMemberId();
    }

    @Override
    public boolean login(String email, String password) {
        return this.getEmail().equals(email) && this.getPassword().equals(password);
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
    public boolean updateProfile() {
        // Simulate profile update
        return true;
    }

    public boolean registerAccount(String name, String email, String password, String phone,
                                   String address, String city, String zip, String country) {
        this.setName(name);
        this.setEmail(email);
        this.setPassword(password);
        this.setPhoneNumber(phone);
        this.address = address;
        this.city = city;
        this.zipCode = zip;
        this.country = country;
        this.isRegistered = true;
        return true;
    }

    public String generateMemberId() {
        return "MID" + System.currentTimeMillis();
    }


}
