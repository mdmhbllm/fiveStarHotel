package com.example.fivestarhotel.FinalProject_MahbubAlam_2221100.Receptionist;

import com.example.fivestarhotel.User.User;

import java.io.Serializable;
import java.util.Random;

public class Receptionist extends User implements Serializable {
    private String deskId;

    public Receptionist(String name, String email, String password, String phoneNumber, String userId, String userType, String deskId) {
        super(name, email, password, phoneNumber, generateReceptionistId(), userType);
        this.deskId = deskId;
    }

    @Override
    public boolean login(String userId, String password) {
        return this.getUserId().equals(userId) && this.getPassword().equals(password);
    }

    @Override
    public void logout() {
        System.out.println("Receptionist " + getName() + " logged out.");
    }

    @Override
    public void viewDashBoard() {
        System.out.println("Showing dashboard for Receptionist " + getName());
    }

    @Override
    public boolean changePassword(String oldPassword, String newPassword, String confirmPassword) {
        if (this.getPassword().equals(oldPassword) && newPassword.equals(confirmPassword)) {
            this.setPassword(newPassword);
            System.out.println("Password updated successfully for " + getName());
            return true;
        }
        System.out.println("Password change failed for " + getName());
        return false;
    }

    @Override
    public void updateProfile(String email, String phoneNumber) {
        this.setEmail(email);
        this.setPhoneNumber(phoneNumber);
        System.out.println("Profile updated for Receptionist " + getName());
    }

    private static String generateReceptionistId() {
        Random random = new Random();
        int randomNumber = 100000 + random.nextInt(900000);
        return "REC" + randomNumber;
    }

    public String getDeskId() {
        return deskId;
    }

    public void setDeskId(String deskId) {
        this.deskId = deskId;
    }
}
