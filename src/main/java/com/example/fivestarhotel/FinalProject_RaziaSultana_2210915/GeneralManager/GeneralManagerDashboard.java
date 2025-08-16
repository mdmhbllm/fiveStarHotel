package com.example.fivestarhotel.FinalProject_RaziaSultana_2210915.GeneralManager;

public class GeneralManagerDashboard {
private String Id;
private String name;
private String email;
private String password;
private String role;

    public GeneralManagerDashboard(String id, String name, String email, String role, String password) {
        Id = id;
        this.name = name;
        this.email = email;
        this.role = role;
        this.password = password;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "GeneralManagerDashboard{" +
                "Id='" + Id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
