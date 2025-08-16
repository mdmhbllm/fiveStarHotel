package com.example.fivestarhotel.User;

import java.io.Serializable;

public abstract class User implements Serializable{
    protected String name;
    protected String email;
    protected String password;
    protected String phoneNumber;
    protected String userType;
    protected String userId;

    public User(String name, String email, String password, String phoneNumber, String userId, String userType) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.userId = userId;
        this.userType = userType;
    }

    public abstract boolean login(String email, String password);
    public abstract void logout();
    public abstract void viewDashBoard();
    public abstract boolean changePassword(String oldPassword, String newPassword, String confirmPassword);
    public abstract void updateProfile(String email, String phoneNumber);

    public String getName() {
        return name; }
    public void setName(String name) {
        this.name = name; }

    public String getEmail() {
        return email; }
    public void setEmail(String email) {
        this.email = email; }

    public String getPassword() {
        return password; }
    public void setPassword(String password) {
        this.password = password; }

    public String getPhoneNumber() {
        return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber; }

    public String getUserId() {
        return userId; }
    public void setUserId(String userId) {
        this.userId = userId; }

    public String getUserType() {
        return userType; }
    public void setUserType(String userType) {
        this.userType = userType; }

}
